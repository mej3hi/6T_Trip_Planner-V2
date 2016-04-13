/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import flugHopur.Flight;
import java.util.ArrayList;
import java.util.Date;
import flugHopur.Search;
import flugHopur.BookingController;


/**
 *
 * @author M
 */
public class FlightSearch {
    BookingController bookingController = new BookingController();
    Search search = new Search();
    private ArrayList<Flight> results;

    public ArrayList<Flight> search(Date departure, String from, String to, int numberOfPassengers){
        String convertedDate = String.format("%1$td.%1$tm.%1$tY", departure);
        results = search.gettingCorrectSearchResults(from, to, numberOfPassengers, convertedDate);
        return results;
    }
    
    // veit ekki hvar við ættum að hafa þetta falli sem uppfæri gagnagrun þeirra 
    // svo ég sit það bara hér til að byrja með
    public void updateDatabase(int numberOfPassengers, int ticketsAvailable, int id){
        bookingController.reduceNumberOfSeats(numberOfPassengers, ticketsAvailable, id);
    }
    
    
    public Flight getFlight(int index){
        return results.get(index);
    }
}
