/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import mock.FlightMock;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eiríkur Kristinn Hlöðversson, Háskóli Íslands, ekh9@hi.is
 */
public class BookingManagerTest {
    
    private BookingManager bookingManager;
    private FlightMock flight;
    
    public BookingManagerTest() {
    }
    
    @Before
    public void setUp() {
        bookingManager = new BookingManager();
        bookingManager.getBookings().customer.setName("Svenni");
        bookingManager.getBookings().customer.setId("1");
        bookingManager.getBookings().customer.setPhone(6789983);
        
        flight = new FlightMock( 1,"Wow",new Date(2016-1900,3-1,3), "12:00", "15:00", "3:00", "Rvk", "Aey","6.000");
        bookingManager.addFlight(flight);
        
    }
    
    @After
    public void tearDown() {
        bookingManager = null;
    }

    @Test
    public void testUpdateCustomer (){
        bookingManager.updateCustomer("Joi", "1", 1234);
        assertEquals("Joi", bookingManager.getBookings().customer.getName());
        assertEquals("1",bookingManager.getBookings().customer.getId());
        assertEquals(1234,bookingManager.getBookings().customer.getPhone());
        
        
    }
    @Test
    public void testAddFlight (){
       
        assertEquals(flight,bookingManager.getBookings().flight.get(0));  
    }
    
}
