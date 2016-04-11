/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import flugHopur.Flight;
import mock.HotelMock;
import mock.DayTourMock;
import ekkiInotkun.FlightMock;
import java.util.ArrayList;
import tourHopur.Tours;

/**
 *
 * @author M
 */
public class Booking {
    public ArrayList<Flight> flight = new ArrayList<>();
    public HotelMock hotel;
    public ArrayList<Tours> daytour = new ArrayList<>();
    public Customer customer = new Customer();
    
}
