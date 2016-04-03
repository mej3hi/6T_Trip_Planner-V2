/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import java.util.Date;

/**
 *
 * @author M |id|Trip|City|Time|Price|
 */ 
public class DayTour {
    public String id;
    public String trip;
    public String city;
    public String time;
    public String price;
    public Date date;
    
    public DayTour(String id,String name,String city,String time,String price, Date date){
        this.id = id;
        this.trip = name;
        this.city = city;
        this.time = time;
        this.price = price;
        this.date = date;
    }
}
