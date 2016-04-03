/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import mock.FlightMock;
import mock.TeamFlightMock;
import java.util.Date;

/**
 *
 * @author M
 */
public class FlightSearch {
    private FlightMock[] results;
    
    public FlightMock[] search(Date departure, String from, String to){
        results = TeamFlightMock.search(departure, from, to);
        return results;
    }
    
    public FlightMock getFlight(int index){
        return results[index];
    }
}
