/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import mock.TeamHotelMock;
import mock.HotelMock;
import java.util.Date;

/**
 *
 * @author M
 */
public class HotelSearch {
    private HotelMock[] results;
    
    public HotelMock[] search(Date date, String at){
        results = TeamHotelMock.search(date, at);
        return results;
    }
    
    public HotelMock getHotel(int index){
        return results[index];
    }
}
