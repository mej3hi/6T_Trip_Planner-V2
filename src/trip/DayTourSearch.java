/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import java.util.ArrayList;
import mock.TeamDayTour;
import mock.DayTourMock;
import java.util.Date;
import tourHopur.Search;
import tourHopur.Tours;

/**
 *
 * @author M
 */
public class DayTourSearch {
  
    private ArrayList<Tours> results;
    Search search = new Search();

    public ArrayList<Tours> search(Date date, String area, String type, String difficulty,
            boolean pickup, boolean handicap, String language, int numOfTickets ){
        
        /*
        Þarf að Converta date í int 
        
         
          
        */
       
        // Fallið þeirra
        //getResult(String dur, String type, String diff, String area , String lang, boolean pUp, 
        //        boolean hCap, int date, int numberOfTickets){ }
        
        results = search.getResults();
        return results;
    }
    
     public Tours getDayTour(int index){
        return results.get(index);
    }
    
}
