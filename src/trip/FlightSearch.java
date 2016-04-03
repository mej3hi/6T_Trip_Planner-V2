/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import java.util.Date;

/**
 *
 * @author M
 */
public class FlightSearch {
    private Flight[] results;
    
    public Flight[] search(Date departure, String from, String to){
        results = fdb.search(departure, from, to);
        return results;
    }
    
    public Flight getFlight(int index){
        return results[index];
    }
}
