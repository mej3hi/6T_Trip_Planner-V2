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
public class DayTourSearch {
    private DayTour[] results;
    
    public DayTour[] search(Date date, String at){
        results = ddb.search(date, at);
        return results;
    }
    
    public DayTour getDayTour(int index){
        return results[index];
    }
}
