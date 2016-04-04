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
public class BookingDatabase {
    public void addBooking(Customer customer, String type, int id){
        DatabaseController.insertInto("Customer", new String[]{"name","ssn","phone","trip","id"}, customer, type, id);
    }
}
