/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

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
    
    public void setHotel(Hotel hotel){
        booking.hotel = hotel;
    }
    
    public void addDayTour(DayTour dayTour){
        booking.daytour.add(dayTour);
    }
    
    public void updateCustomer(String name, int id, int phone){
        booking.customer.setName(name);
        booking.customer.setId(id);
        booking.customer.setPhone(phone);
    }
}

