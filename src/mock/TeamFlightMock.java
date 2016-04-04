/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

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
public class TeamFlightMock {
    
    // ---- Database     -----------------------------------
    // |id|Airline|Date|Departure|Arrival|Duration|From|To|Price|
    public static String[][] data = new String[][]{
        { "1","Wow", "03.03.2016", "12:00", "15:00", "3:00", "Rvk", "Aey","6.000"},
        { "2","IceAir", "03.03.2016", "18:00", "21:00", "3:00", "Rvk", "Aey","5.000"}
    };
    //-------------------------------------------------------
    
    /**
     * Method that "searches" in data (Database above) and returns object with 
     * flights that matches the parameters
     * 
     * @param date departure date
     * @param from location
     * @param to location
     * @return array with flight objects
     */
   
    public static FlightMock[] search(Date date, String from, String to){
        FlightMock[] flightobj = new FlightMock[2];
        int k=0;
        for(int i=0; i<data.length; i++){
            if(date.compareTo(std(data[i][2]))==0 && data[i][6].toLowerCase().equals(from.toLowerCase()) && data[i][7].toLowerCase().equals(to.toLowerCase())){
                flightobj[k]= new FlightMock(Integer.parseInt(data[i][0]),data[i][1],std(data[i][2]),data[i][3],data[i][4],data[i][5],data[i][6],data[i][7],data[i][8]);
                k++;
            }   
        }
        if(k == 0) return null;
        return flightobj;
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
