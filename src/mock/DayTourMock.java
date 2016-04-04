/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import java.util.Date;

/**
 * Class for dayTour object
 * @author M |id|Trip|City|Time|Price|
 */ 
public class DayTourMock {
    public int id;
    public String trip;
    public String city;
    public String time;
    public String price;
    public Date date;
    /**
     * Constructor
     * @param id
     * @param name
     * @param city
     * @param time
     * @param price
     * @param date 
     */
    public DayTourMock(int id,String name,String city,String time,String price, Date date){
        this.id = id;
        this.trip = name;
        this.city = city;
        this.time = time;
        this.price = price;
        this.date = date;
    }
}
