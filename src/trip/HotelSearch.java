/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import java.util.Date;

/**
 *
 * @author M
 */
public class HotelSearch {
    private Hotel[] results;
    
    public Hotel[] search(Date date, String at){
        results = hdb.search(date, at);
        return results;
    }
    
    public Hotel getHotel(int index){
        return results[index];
    }
}
