/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eiríkur Kristinn Hlöðversson, Háskóli Íslands, ekh9@hi.is
 */
public class ValidateTest {
    
    private Validate validate;
    
    public ValidateTest() {
    }
    
    @Before
    public void setUp() {
        validate = new Validate();
        
    }
    
    @After
    public void tearDown() {
        validate=null;
    }

    @Test
    public void testValidateName(){
        assertFalse(validate.name("s"));
        assertFalse(validate.name("skuli2"));
        assertFalse(validate.name("$%&/("));
        assertTrue(validate.name("skúli Jón Þór"));
    }
    
    @Test
    public void testValidatePhone(){
        assertTrue(validate.phone("6944931"));
        assertTrue(validate.phone("694 4931"));
        assertFalse(validate.phone("694493234234234234234234"));
        assertFalse(validate.phone("Eitthvadbull"));
        assertFalse(validate.phone("6944"));
    }
    
    @Test
    public void testValidateSsn(){
        assertTrue(validate.ssn("1611612229"));
        assertFalse(validate.ssn("161161222121232323"));
    }
    
   
    
}
