/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import flugHopur.Flight;
import java.util.ArrayList;
import ekkiInotkun.FlightMock;
import ekkiInotkun.TeamFlightMock;
import java.util.Date;
import flugHopur.Search;


/**
 *
 * @author M
 */
public class FlightSearch {
    private ArrayList<Flight> results;
    Search search = new Search();

    public ArrayList<Flight> search(Date departure, String from, String to, int numberOfPassengers){
        String convertedDate = String.format("%1$td.%1$tm.%1$tY", departure);
        results = search.gettingCorrectSearchResults(from, to, numberOfPassengers, convertedDate);
        return results;
    }
    
    public Flight getFlight(int index){
        return results.get(index);
    }
}
