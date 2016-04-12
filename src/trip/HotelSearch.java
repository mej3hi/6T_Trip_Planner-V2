/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import hotelHopur.Hotel;
import hotelHopur.SearchControl;
import hotelHopur.SearchMock;
import hotelHopur.sqlworkBenchInterface;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author M
 */
public class HotelSearch {
    
    
    private ArrayList<Hotel> results;
    SearchControl searchControl = new SearchControl();
    
    
    //???
    public ArrayList<Hotel> search(Date datein, Date dateout, String name, String room, String address, String city, boolean wifi,
            boolean freewifi, boolean smoke, boolean spool, boolean gym, boolean tv ){
        
       
        
        results = searchControl.LeitaHotel("r", "24 mar. 2016", "24 mar. 2016");
        
        return results;
    }
    
    public Hotel getHotel(int index){
        return results.get(index);
    }
    
}
