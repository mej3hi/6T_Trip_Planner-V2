/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import flugHopur.Flight;
import tourHopur.model.Tours;
import hotelHopur.Hotel;

/**
 *
 * @author M
 */
public class BookingManager {
    private final Booking booking = new Booking();
    
    
    public Booking getBookings(){
        return booking;
    }
    
    public void addFlight(Flight flight){
        booking.flight.add(flight);
    }
    
    public void addHotel(Hotel hotel){
        booking.hotel.add(hotel);
    }
    
    public void addDayTour(Tours dayTour){
        booking.daytour.add(dayTour);
    }
    
    public void updateCustomer(String name, String ssn, int phone){
        booking.customer.setName(name);
        booking.customer.setSsn(ssn);
        booking.customer.setPhone(phone);
    }
}

