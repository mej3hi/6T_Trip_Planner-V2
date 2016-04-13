/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import Hotel.FinaliseBooking;
import hotelHopur.Hotel;
import hotelHopur.SearchControl;
import hotelHopur.SearchMock;
import hotelHopur.sqlworkBenchInterface;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author M
 */
public class HotelSearch {
    
    
    private ArrayList<Hotel> results;
    SearchControl searchControl = new SearchControl();
    
    
    //???
    public ArrayList<Hotel> search(Date datein, Date dateout, String room, String city, boolean wifi,
            boolean freewifi, boolean smoke, boolean spool, boolean gym, boolean tv ){
        
        //String convertedDatein = String.format("%1$td mar. %1$tY", datein);
        //String convertedDateout = String.format("%1$td mar. %1$tY", dateout);
      
        //System.out.println(convertedDatein);
        //System.out.println(convertedDateout);
        
        Date datein2 = new Date();
        String dateinS = FinaliseBooking.dateToString(datein2);
	Date dateout2 = FinaliseBooking.addDays(datein2, 10);
	String dateoutS = FinaliseBooking.dateToString(dateout2);
        
        System.out.println(datein2);
        System.out.println(dateout2);
        
        
        results = searchControl.LeitaHotel(city, dateinS, dateoutS);
        
        if (wifi) results = searchControl.detailedSearch(results, 0);
        if (freewifi) results = searchControl.detailedSearch(results, 1);
        if (spool) results = searchControl.detailedSearch(results, 2);
        if (gym) results = searchControl.detailedSearch(results, 3);
        if (tv) results = searchControl.detailedSearch(results, 4);
        if (smoke) results = searchControl.detailedSearch(results, 5);
        
        
        
        return results;
    }
    
    public Hotel getHotel(int index){
        return results.get(index);
    }
    
}
