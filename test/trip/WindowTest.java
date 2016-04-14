/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import is.hbv401g.tripPlanner.view.Window;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Sólveig
 */
public class WindowTest {
    private Window flight1;
    private Window hotel1;
    private Window dayTour1;
    private String rvk;
    private String aey;
    private String blabla;
    private String bull;
    private String reykjavik;
    private String bolungarvik;
    
    
    public WindowTest() {
    }
    
    @Before
    public void setUp() {
        flight1 = new Window();
        hotel1 = new Window();
        dayTour1 = new Window();
        rvk = "Rvk";
        aey = "Aey";
        blabla = "BlaBla";
        bull ="bull";
        reykjavik = "Reykjavík";
        bolungarvik = "Bolungarvík";
        
    }
    
    @After
    public void tearDown() {
        flight1 = null;
        hotel1 = null;
        dayTour1 = null;
        rvk = null;
        aey = null;
        blabla = null;
        bull = null;
        reykjavik = null;
        bolungarvik = null;
        
    }
    /*
    @Test
    public void testFlightSearch(){
        Date departure = new Date(2016-1900,3-1,3);
        FlightMock[] result = flight1.flightSearch.search(departure, rvk, aey);
        assertNotNull(result);
        
        departure = new Date(2016-1900,3-1,3);
        result = flight1.flightSearch.search(departure, blabla, aey);
        assertNull(result);
        
        departure = new Date(2016-1900,3-1,3);
        result = flight1.flightSearch.search(departure, rvk, bull);
        assertNull(result);
        
        departure = new Date(1999-1900,3-1,3);
        result = flight1.flightSearch.search(departure, blabla, aey);
        assertNull(result);
        
        
    }
    */
    @Test
    public void testSearchHotel(){
    /*    Date departure = new Date(2016-1900,3-1,3);
        HotelMock[] result = hotel1.hotelSearch.search(departure, reykjavik);
        assertNotNull(result);
        
        departure = new Date(1999-1900,3-1,3);
        result = hotel1.hotelSearch.search(departure, reykjavik);
        assertNull(result);
        
        departure = new Date(2016-1900,3-1,3);
        result = hotel1.hotelSearch.search(departure, bolungarvik);
        assertNull(result);
*/
    }
    
    @Test
    public void testSearchDayTour(){
       /* Date departure = new Date(2016-1900,3-1,3);
        DayTourMock[] results = dayTour1.dayTourSearch.search(departure, reykjavik);
        assertNotNull(results);
        
        departure = new Date(1999-1900,3-1,3);
        results = dayTour1.dayTourSearch.search(departure, reykjavik);
        assertNull(results);
        
        departure = new Date(2016-1900,3-1,3);
        results = dayTour1.dayTourSearch.search(departure, reykjavik);
        assertNull(results);    
*/
    }
  
}
