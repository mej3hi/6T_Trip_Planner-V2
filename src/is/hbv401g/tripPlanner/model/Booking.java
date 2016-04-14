
package is.hbv401g.tripPlanner.model;

import is.hbv401g.flight.Flight;
import java.util.ArrayList;
import is.hbv401g.dayTour.model.Tours;
import is.hbv401g.hotel.Hotel;

/**
 *
 * @author 6T_Trip_planner group
 */
public class Booking {
    public ArrayList<Flight> flight = new ArrayList<>();
    public ArrayList<Hotel> hotel = new ArrayList<>();
    public ArrayList<Tours> daytour = new ArrayList<>();
    public Customer customer = new Customer();
    
}
