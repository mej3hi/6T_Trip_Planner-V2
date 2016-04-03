/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import java.util.Arrays;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sólveig
 */
public class WindowTest {
    private Window flight1;
    private Window hotel1;
    private Window dayTour1;
    
    public WindowTest() {
    }
    
    @Before
    public void setUp() {
        flight1 = new Window();
        hotel1 = new Window();
        dayTour1 = new Window();
    }
    
    @After
    public void tearDown() {
        flight1 = null;
        hotel1 = null;
        dayTour1 = null;
    }
    
    @Test
    public void testFlightSearch(){
        Date departure = new Date(2016-1900,3-1,3);
        String from = "Rvk";
        String to = "Aey";
        Flight[] result = flight1.flightSearch.search(departure, from, to);
       //System.out.print("SearchFlight");
        assertNotNull(result);
        
        departure = new Date(2016-1900,3-1,3);
        from = "BlaBla";
        to = "Aey";
        result = flight1.flightSearch.search(departure, from, to);
       // System.out.println("SearchFlight");
        assertNull(result);
        
        departure = new Date(2016-1900,3-1,3);
        from = "Rvk";
        to = "BullBull";
        result = flight1.flightSearch.search(departure, from, to);
        //System.out.println("SearchFlight");
        assertNull(result);
        
        departure = new Date(1999-1900,3-1,3);
        from = "BlaBla";
        to = "Aey";
        result = flight1.flightSearch.search(departure, from, to);
        //System.out.println("SearchFlight");
        assertNull(result);
        
        
    }
    
    @Test
    public void testSearchHotel(){
        Date departure = new Date(2016-1900,3-1,3);
        String city = "Reykjavík";
        Hotel[] result = hotel1.hotelSearch.search(departure, city);
        //System.out.print(result);
        assertNotNull(result);
        
        departure = new Date(1999-1900,3-1,3);
        city = "Reykjavík";
        result = hotel1.hotelSearch.search(departure, city);
       // System.out.println(result);
        assertNull(result);
        
        departure = new Date(2016-1900,3-1,3);
        city = "Bolungarvík";
        result = hotel1.hotelSearch.search(departure, city);
       // System.out.println(Arrays.toString(result));
        assertNull(result);
    }
    
    @Test
    public void testSearchDayTour(){
        Date departure = new Date(2016-1900,3-1,3);
        String city = "Reykjavík";
        DayTour[] results = dayTour1.dayTourSearch.search(departure, city);
        //System.out.print(Arrays.toString(results));
        assertNotNull(results);
        
        departure = new Date(1999-1900,3-1,3);
        city = "Reykjavík";
        results = dayTour1.dayTourSearch.search(departure, city);
        //System.out.println(Arrays.toString(results));
        assertNull(results);
        
        departure = new Date(2016-1900,3-1,3);
        city = "Bolungarvík";
        results = dayTour1.dayTourSearch.search(departure, city);
        //System.out.println(Arrays.toString(results));
        assertNull(results);    
    }
  
}
