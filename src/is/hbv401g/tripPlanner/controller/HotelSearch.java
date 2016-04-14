/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hbv401g.tripPlanner.controller;

import is.hbv401g.hotel.FinaliseBooking;
import is.hbv401g.hotel.Hotel;
import is.hbv401g.hotel.SearchControl;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 6T_Trip_planner group
 */
public class HotelSearch {
    
    
    private ArrayList<Hotel> results;
    
    
    //???
    public ArrayList<Hotel> search(Date datein, Date dateout, String room, String city, boolean wifi,
            boolean freewifi, boolean smoke, boolean spool, boolean gym, boolean tv ){
        
    
       
        String dateinS = FinaliseBooking.dateToString(datein);
	String dateoutS = FinaliseBooking.dateToString(dateout);    
        
        results = SearchControl.LeitaHotel(city, dateinS, dateoutS);
        
        if (wifi) results = SearchControl.detailedSearch(results, 0);
        if (freewifi) results = SearchControl.detailedSearch(results, 1);
        if (spool) results = SearchControl.detailedSearch(results, 2);
        if (gym) results = SearchControl.detailedSearch(results, 3);
        if (tv) results = SearchControl.detailedSearch(results, 4);
        if (smoke) results = SearchControl.detailedSearch(results, 5);
        
        
        
        return results;
    }
    
    public Hotel getHotel(int index){
        return results.get(index);
    }


    public void updateDatabase(int id, int i, Date checkIn, Date checkOut, int rooms, String clientid, String client_passw, int roomType) {
        String dateIn = FinaliseBooking.dateToString(checkIn);
        String dateOut = FinaliseBooking.dateToString(checkOut);
        
        FinaliseBooking.updateAllTheDataBase(id, rooms, dateIn, dateOut, rooms, clientid, client_passw, rooms);
    }
    
}
