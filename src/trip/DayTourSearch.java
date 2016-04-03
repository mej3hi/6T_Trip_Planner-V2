/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import mock.TeamDayTour;
import mock.DayTourMock;
import java.util.Date;

/**
 *
 * @author M
 */
public class DayTourSearch {
    private DayTourMock[] results;
    
    public DayTourMock[] search(Date date, String at){
        results = TeamDayTour.search(date, at);
        return results;
    }
    
    public DayTourMock getDayTour(int index){
        return results[index];
    }
}
