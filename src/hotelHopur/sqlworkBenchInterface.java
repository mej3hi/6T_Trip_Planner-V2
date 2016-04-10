/*
Hér er interface með öllum sql skipununum sem við notum. 

Hotel(int id, String name, String address, int postcode, String city, String URL,
		int Wifi, int FreeWifi, int Smoke, int Spool, int Gym, int TV)

Þetta er Hotel klasinn okkar. Wifi, freewifi ... tv eru int breytur(ættu náttla að vera boolean) 
sem eru 0 eða 1. 1 ef hótelið hefur það. Hotel hefur get aðgerðir fyrir þetta allt.

*/
package hotelHopur;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Eiríkur Kristinn Hlöðversson, Háskóli Íslands, ekh9@hi.is
 */
public interface sqlworkBenchInterface {
    static String qry = "";
	static String qry2 = "";
	static ResultSet rs = null;

	/*
	 * Usage: sqlWorkBench.LeitaHotel(tmp); 
	 * Pre: tmp is a String that the query should look for in the datebase. 
	 * 		i.e. "Reykjavik", looks for everything in the database
	 * 		that matches that string.
	 * 		tmp can be the name of a city, name of the hotel, zipcode or address.
	 *      tmp can also be the empty string "". 
	 * Post: An ArrayList<Hotel> that contains all the Hotel objects that
	 * 		 match the String tmp. If tmp was empty, it returns all the Hotel's.
	 */
	public static ArrayList<Hotel> LeitaHotel(String tmp) {
		return null;
	}

	/*
	 * Usage: sqlWorkBench.makebooking(hotelID, reservationID, dateins, dateouts, nrOfRooms, clientid, client_passw); 
	 * Pre: hotelID is a integer 
	 * Post: 
	 */
	public static void makebooking(int hotelID, int reservationID,
			String dateins, String dateouts, int nrOfRooms, String clientid,
			String client_passw) {
	}

	// Fall til þess að eyða viðskiptavinum út úr database.
	public static void clientDelete(String resID) {
	}

	// A method that inserts into roomreserved in the database. So that the
	// program can
	// later see if a hotel is fully booked.
	public static void reservedroom(int hotelid, int reservationid,
			String date, int roomtype) {
	}

	// Þegar pantað er þá uppfærist fjöldi lausra herbergja.
	public static void updateRoomBookings(String date) {
	}

	// A method that enables a client to login to the system and see/cancel his
	// reservation.
	public static void login(JTextField textField, JPasswordField p) {
	}

	// A method that returns an in that is the amount of rooms taken at a
	// certain
	// hotel from date dateres to dateout.

	/*
	 * Usage: sqlWorkBench.RoomsAvailable(hotelid, datein, dateout) 
	 * Pre: hotelid is an int that is the id of the Hotel. datein and 
	 *      dateout are strings that contain the dates in and out 
	 *      which are being checked if there are rooms available.
	 *      
	 *      datein and dateout are of the format: 
	 *      SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy"); 
	 *      
	 * Post: An int that says the number of rooms that are RESERVED between the
	 * 		 dates datein and dateout. So to get the number of rooms available,
	 * 		 you need to subtract the int from your Hotel.getRooms().
	 * 
	 * 		In short, this method returns the number of rooms TAKEN between 
	 * 		the two dates.
	 */
	public static int RoomsAvailable(int hotelid, String datein, String dateout) {
		return 0;
	}

	// Fall sem skilar fjölda viðskiptavina.
	public static void clientIDs() {

	}

	// Fall sem skilar fjölda viðskiptavina.
	public static int NrOfClients() {
		return 0;
	}

	// Fall sem skilar nafni Hótels þ.s. id er 
	// id Hotelsins.
	public static String HotelName(String id) {
		return id;
	}

	// Fall sem leitar að verði eftir hótelherbergi.
	public static String priceSearch() {
		return null;
	}

	/*
	 * Usage: detailedSearch(hotelList, var); 
	 * Pre: hotelList is an
	 * 		ArrayList<Hotel> and var is an integer. 
	 * Post: The method returns a new
	 * 		ArrayList. It contains the Hotels from hotelList that have specific
	 * 		facilities that the client is looking for. i.e. wifi, gym, etc.
	 */
	public static ArrayList<Hotel> detailedSearch(ArrayList<Hotel> hotelList,
			int var) {
		return hotelList;
	}
}
