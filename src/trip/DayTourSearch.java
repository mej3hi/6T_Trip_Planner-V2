/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import java.util.ArrayList;
import java.util.Date;
import tourHopur.controller.Search;
import tourHopur.model.Tours;
import tourHopur.controller.Booking;

/**
 *
 * @author M
 */
public class DayTourSearch {
    Search search = new Search();
    Booking booking = new Booking();
    private ArrayList<Tours> results = new ArrayList<>();

    public ArrayList<Tours> search(Date date, String area, String type, String difficulty,
            boolean pickup, boolean handicap, String language, int numOfTickets ){
        
        String convertedDate = String.format("%1$td.%1$tm.%1$tY", date);
        String convertedType = type.toLowerCase().replaceAll("\\s+","");
        
        if(date == null) convertedDate = "";
        // Þurfum aðeins að breyta því sem kemur úr comboboxunum til að það passi við gagnagrunnninn
        results.clear();
        results = search.getResults(0.0, convertedType, difficulty, area, 0, 0, language, pickup, handicap, convertedDate , numOfTickets);
        return results;
        // Fallið þeirra     
       //getResults(double duration, String type, String difficulty, String area, int minPrice, int maxPrice, 
       //   String language, boolean pickup, boolean handicap, String date, int availableTickets) 
    }
    
     public Tours getDayTour(int index){
        return results.get(index);
    }

    void updateDatabase(int id, int tickets) {
        booking.makeBooking(id, tickets);
    }
    
}
