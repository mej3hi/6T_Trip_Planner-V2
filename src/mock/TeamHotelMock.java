/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import mock.HotelMock;
import mock.TeamFlightMock;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M
 */
public class TeamHotelMock {
    
    // ---- Database -----------------------------------
    // |id|HotelMock|City|Price|
    public static String[][] data = new String[][]{
        { "1","Saga", "Reykjavík", "10.000", "03.03.2016"},
        { "2","Natura", "Reykjavík", "12.000", "03.03.2016"}
    };
    //-------------------------------------------------------
    /**
     * Method that "searches" in data (Database above) and returns object with 
     * hotel that matches the parameters
     * 
     * @param date date
     * @param city city
     * @return array with hotel objects
     */
    public static HotelMock[] search(Date date, String city){
        HotelMock[] hotelobj = new HotelMock[2];
        int k=0;
        for(int i=0; i<data.length; i++){
            if(date.compareTo(std(data[i][4]))==0 && city.equals(data[i][2])){
                hotelobj[k]= new HotelMock(Integer.parseInt(data[i][0]),data[i][1],data[i][2],data[i][3],std(data[i][4]));
                k++;
            }   
        }
        if(k == 0) return null;
        return hotelobj;
    }
    /**
     * Converts String ("MM.d.yyyy") to date format
     * @param string MM.d.yyyy
     * @return Date 
     */
    public static Date std(String string){
        DateFormat format = new SimpleDateFormat("MM.d.yyyy", Locale.ENGLISH);
        Date date = null;
        try {
            date = format.parse(string);
        } catch (ParseException ex) {
            Logger.getLogger(TeamFlightMock.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }
}
