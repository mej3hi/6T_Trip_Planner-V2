
package is.hbv401g.tripPlanner.controller;

import is.hbv401g.flight.Flight;
import java.util.ArrayList;
import java.util.Date;
import is.hbv401g.flight.BookingController;


/**
 *
 * @author 6T_Trip_planner group
 */
public class FlightSearch extends is.hbv401g.flight.Search{
    BookingController bookingController = new BookingController();
    private ArrayList<Flight> results;

    public ArrayList<Flight> search(Date departure, String from, String to, int numberOfPassengers){
        String convertedDate = String.format("%1$td.%1$tm.%1$tY", departure);
        results = gettingCorrectSearchResults(from, to, numberOfPassengers, convertedDate);
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
