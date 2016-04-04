/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import mock.HotelMock;
import mock.DayTourMock;
import mock.FlightMock;

/**
 *
 * @author M
 */
public class BookingManager {
    private final Booking booking = new Booking();
    
    public Booking getBookings(){
        return booking;
    }
    
    public void addFlight(FlightMock flight){
        booking.flight.add(flight);
    }
    
    public void setHotel(HotelMock hotel){
        booking.hotel = hotel;
    }
    
    public void addDayTour(DayTourMock dayTour){
        booking.daytour.add(dayTour);
    }
    
    public void updateCustomer(String name, String id, int phone){
        booking.customer.setName(name);
        booking.customer.setId(id);
        booking.customer.setPhone(phone);
    }
}

