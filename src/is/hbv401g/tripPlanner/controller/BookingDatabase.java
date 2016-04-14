
package is.hbv401g.tripPlanner.controller;

import is.hbv401g.tripPlanner.model.Customer;

/**
 *
 * @author 6T_Trip_planner group
 */
public class BookingDatabase {
    public void addBooking(Customer customer, String type, int id){
        DatabaseController.insertInto("Customer", new String[]{"name","ssn","phone","trip","id"}, customer, type, id);
    }
}
