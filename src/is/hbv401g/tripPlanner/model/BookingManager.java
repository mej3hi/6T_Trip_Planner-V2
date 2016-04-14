package is.hbv401g.tripPlanner.model;

import is.hbv401g.flight.Flight;
import is.hbv401g.dayTour.model.Tours;
import is.hbv401g.hotel.Hotel;

/**
 *
 * @author 6T_Trip_planner group
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

