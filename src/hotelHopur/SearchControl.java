package hotelHopur;
/**
 * SearchControl inniheldur fjórar aðferðir. Eina aðalaðferð sem finnur þau Hótel sem uppfylla
 * skilyrði notanda. Og þrjú hjálparföll sem aðalaðferðin notar til þess að vinna með dagsetningar.
 * @author Atli Þór Jóhansson, Hlynur Logi Þorsteinsson, Sindri Ingólfsson og Sigurbjörn Viðar Karlsson
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class SearchControl {

	static Connection c;

	
	/**
	 * SearchControl klasinn sér um alla leit að Hótelum í databasenum.
	 * Í honum eru víðværu breyturnar c, sem er Connection til þess að
	 * tengjast databasenum. hotelList sem er ArrayListi fyrir Hotel
	 * hluti. 
	 * 
	 * í SearchControl eru fjögur föll. LeitaHotel sem skilar Hotel listanum
	 * sem fer eftir eftirspurn notandans. 
	 * 
	 * LeitaHotel notar svo þrjú hjálparföll fyrir vinnslu á dagsetningum.
	 * Ástæðan fyrir þessu er sú að ef notandi leitar að herbergjum frá 
	 * dagsetningu 1 til 3. Þá getur ákveðið hótel haft laust herbergi
	 * á dagsetningu 1, dagsetningu 3 en ekki dagsetningu 2. Þ.a. 
	 * MinRoomsAvailable skilar svo hámarksfjölda herbergja sem pöntuð eru fyrir 
	 * ákveðin dag fyrir tímabilið sem spurt er um. Nafnið á fallinu er þvi villandi.
	 * 
	 * MinRoomsAvailable notar svo datevinnsla og addDays sem hjálparföll.
	 * 
	 * Athugið, að til þess að fá verðið á bókuninni, þá er Hotel með get Skipun
	 * sem nær í verðið miðað við pöntunina. Þ.e. fjölda kúnna og fjölda herbergja pantað.
	 * Einnig hvaða týpu af herbergjum, 1 2 eða 3. 
	 * 
	 *  Þá þarf að gera:
	 * 
	 * int i = hotelid.getOrderRoomPrice1(fjoldikúnna, fjöldiherbergja);
	 * Þetta gildir líka fyrir týpu 2 og 3 af herbergjum. Þ.e. getOrderRoomprice2 og 3.
	 * 
	 * 
	 * @param tmp skilyrði frá notanda - Leitar strengur
	 * @param datein skilyrði frá notanda - Dagsetning innritunar
	 * @param dateout  skilyrði frá notanda - Dagsetning útritunar
	 * @return Hótel sem uppfylla skilyrði notanda
	 */
	
	
	
	// A method that searches for a hotel with the information in the textarea
	// in the Front class.
	public static ArrayList<Hotel> LeitaHotel(String tmp, String datein,
			String dateout) {
		ArrayList<Hotel> theList = new ArrayList<Hotel>();
		
		try {
			//Tenging við Hotel.db 
			c = DriverManager.getConnection("jdbc:sqlite:Hotel.db");
			//Búum til sql skipun.
			String qry = "Select * from Hotel,hotelfacilities, room_price where Hotel.id=Hotelfacilities.hotelid AND Hotel.id = Room_price.Hotelid AND ( Hotel.name LIKE'%"
					+ tmp
					+ "%' OR Hotel.city LIKE'"
					+ tmp
					+ "%' OR Hotel.postcode LIKE'"
					+ tmp
					+ "%' OR Hotel.address LIKE'" + tmp + "%');";

			//Fáum gögnin frá gagnagrunninum.
			PreparedStatement statement = c.prepareStatement(qry);
			statement.setQueryTimeout(30);
			ResultSet HotelResultSet = statement.executeQuery();

			//Loopum í gegnum ResultSet-ið og búum til Hotel hluti sem við
			//setjum svo inn í ArrayLista
			while (HotelResultSet.next()) {

				String name = HotelResultSet.getString("name");
				String address = HotelResultSet.getString("address");
				String city = HotelResultSet.getString("city");
				String URL = HotelResultSet.getString("URL");
				int id = Integer.parseInt(HotelResultSet.getString("id"));
				int postcode = Integer.parseInt(HotelResultSet
						.getString("postcode"));
				int wifi = Integer.parseInt(HotelResultSet.getString("Wifi"));
				int FreeWifi = Integer.parseInt(HotelResultSet
						.getString("FreeWifi"));
				int Smokearea = Integer.parseInt(HotelResultSet
						.getString("SmokingArea"));
				int SPool = Integer.parseInt(HotelResultSet
						.getString("Swimmingpool"));
				int Gym = Integer.parseInt(HotelResultSet.getString("Gym"));
				int TV = Integer.parseInt(HotelResultSet.getString("TV"));

				Hotel hotelTmp = new Hotel(id, name, address, postcode, city,
						URL, wifi, FreeWifi, Smokearea, SPool, Gym, TV);
				
				//Hér athugum við hversu mörg herbergi eru laus fyrir hvert
				//hótel og stillum fjölda lausra herbergja samkvæmt þvi.
				//Stillum einnig verðin á herbergjunum. Í databasenum
				// eru þrjár tegundir af herbergjum. 1-3, þ.s. 1 er dýrast
				// og 3 ódýrast. 1 hefur fæst herbergi og 3 flest.
				int minRooms1 = MinRoomsAvailable(id, datein, dateout, 1);
				int minRooms2 = MinRoomsAvailable(id, datein, dateout, 2);
				int minRooms3 = MinRoomsAvailable(id, datein, dateout, 3);
				hotelTmp.setPriceOfRoomType1(Integer.parseInt(HotelResultSet
						.getString("type1")));
				hotelTmp.setPriceOfRoomType2(Integer.parseInt(HotelResultSet
						.getString("type2")));
				hotelTmp.setPriceOfRoomType3(Integer.parseInt(HotelResultSet
						.getString("type3")));
				hotelTmp.setRoomType1Count(Integer.parseInt(HotelResultSet
						.getString("counttype1")) - minRooms1);
				hotelTmp.setRoomType2Count(Integer.parseInt(HotelResultSet
						.getString("counttype2")) - minRooms2);
				hotelTmp.setRoomType3Count(Integer.parseInt(HotelResultSet
						.getString("counttype3")) - minRooms3);

				theList.add(hotelTmp);

			}

			HotelResultSet.close();
			statement.close();

		} catch (Exception e2) {
			System.out.println(e2);

		}

		return theList;

	}

	/* Þetta fall loopar í gegnum allar dagsetningar frá dateres til dateout.
	 * Það finnur dagsetninguna með flestum bókunum og skilar fjölda bókanna þann
	 * dag. Sú tala er svo notuð til að reikna út hversu mörg herbergi eru laus
	 * fyrir ákveðið hótel á ákveðnu tímabili.
	 * 
	 * ATH: Þið þurfið ekkert að pæla í þessum föllum sem eru hér. Þetta 
	 * eru einungis hjálparföll fyrir LeitaHotel.
	 * 
	 */
	public static int MinRoomsAvailable(int hotelid, String dateres,
			String dateout, int roomtype) {
		String name = "0";

		ArrayList<String> myDays = datevinnsla(dateres, dateout);
		for (int i = 0; i < myDays.size(); i++) {
			try {
////// EIKI ///////////                        c = sqliteConnection.dbConnector();
				String NoOfRoomsTaken = "select *, count(hotelid) as pi from roomreserved where hotelid='"
						+ hotelid
						+ "' and datereserved = '"
						+ myDays.get(i)
						+ "' and roomtype = '"
						+ roomtype
						+ "'  group by datereserved;";
				PreparedStatement statement = c
						.prepareStatement(NoOfRoomsTaken);
				statement.setQueryTimeout(30);
				ResultSet rs = statement.executeQuery();
				;
				while (rs.next()) {
					String tmp = rs.getString("pi");
					if (Integer.parseInt(name) < Integer.parseInt(tmp)) {
						name = tmp;
					}
				}

			} catch (Exception e2) {
				System.err.println( e2.getClass().getName() + ": " + e2.getMessage() );
	            System.exit(0);
			}
		}
		return Integer.parseInt(name);
	}

	/*
	 	Fall sem býr til ArrayLista með strengjum fyrir hverja dagsetningu
	 	frá in og out.(innritun og útritun).
	 */
	public static ArrayList<String> datevinnsla(String in, String out) {
		String tmpin = in.substring(0, 2);
		String tmpout = out.substring(0, 2);
		int itmp = Integer.parseInt(tmpin);
		int itmpout = Integer.parseInt(tmpout);
		ArrayList<String> dayList = new ArrayList<String>();
		dayList.add(in);
		// System.out.println("in " + in + " out " + out);
		while (itmp != itmpout) {

			SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");
			Date myDate;

			try {
				myDate = format.parse(in);
				myDate = addDays(myDate, 1);
				String newdate = format.format(myDate);
				tmpin = newdate.substring(0, 2);
				itmp = Integer.parseInt(tmpin);
				dayList.add(newdate);
				in = newdate;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return dayList;
	}

	// A method that adds a certain amount of days to a date.
	// The method adds 'days' days to the date.
	public static Date addDays(Date date, int days) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days); // minus number would decrement the days
		
		return cal.getTime();
	}

}
