package tourHopur.controller;

import tourHopur.model.SQLiteJDBC;
import tourHopur.model.Tours;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Booking {
	
    private Tours booked;
    private int seatsAvailableBefore;

    private SQLiteJDBC database;

    //private Tours data = new Tours();

    public Booking() {
        this.database = new SQLiteJDBC();
    }
	
	public void makeBooking(int id, int seats) {
		
            String getChosenSeats = "SELECT seats_available FROM tour WHERE id = " + id;
            ResultSet chosenTour = database.getData(getChosenSeats);
            
            try {
                while (chosenTour.next()) {
                    seatsAvailableBefore = (chosenTour.getInt("seats_available"));
                }
                System.out.println("Bókun tokst");
            } 
            catch (Exception ex) {
                System.out.println("engin bókun tókst");
                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
            }
            int newSeatsAvailable = seatsAvailableBefore - seats;
            
            String updateDatabase = "UPDATE TOUR SET seats_available = " + 
                    newSeatsAvailable + " WHERE id = " + id; 
                    
            
            database.changeData(updateDatabase);
            
// update database according to new number of booked seats
	}
}
