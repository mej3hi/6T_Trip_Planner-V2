/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import mock.HotelMock;
import mock.DayTourMock;
import mock.FlightMock;
import java.util.ArrayList;

/**
 *
 * @author M
 */
public class Booking {
    public ArrayList<FlightMock> flight = new ArrayList<>();
    public HotelMock hotel;
    public ArrayList<DayTourMock> daytour = new ArrayList<>();
    public Customer customer = new Customer();
    
}
