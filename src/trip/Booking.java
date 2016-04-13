/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import flugHopur.Flight;
import java.util.ArrayList;
import tourHopur.model.Tours;
import hotelHopur.Hotel;

/**
 *
 * @author M
 */
public class Booking {
    public ArrayList<Flight> flight = new ArrayList<>();
    public ArrayList<Hotel> hotel = new ArrayList<>();
    public ArrayList<Tours> daytour = new ArrayList<>();
    public Customer customer = new Customer();
    
}
