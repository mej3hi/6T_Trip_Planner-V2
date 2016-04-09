/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eiríkur Kristinn Hlöðversson, Háskóli Íslands, ekh9@hi.is
 */
public class CustomerTest {
    
    private Customer customer;
    
    public CustomerTest() {
    }
    
   
    @Before
    public void setUp() {
        customer = new Customer();
        customer.setSsn("23");
        customer.setName("Kalli");
        customer.setPhone(5885522);
    }
    
    @After
    public void tearDown() {
        customer = null;
    }
    
    @Test
    public void testGetName() {
        assertEquals("Kalli", customer.getName());
    }
    
    @Test
    public void testGetId() {
        assertEquals("23", customer.getSsn());
    }
    @Test
    public void testGetPhone() {
        assertEquals(5885522, customer.getPhone());
        assertNotSame(5885, customer.getPhone());
    }
    
}
