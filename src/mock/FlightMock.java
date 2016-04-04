/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import java.util.Date;

/**
 * Class for Flight object
 * @author M
 */
public class FlightMock {
    public int id;
    public String airline;
    public Date date;
    public String departure;
    public String arrival;
    public String duration;
    public String from;
    public String to;
    public String price;
    /**
     * Constructor
     * @param id
     * @param airline
     * @param date
     * @param departure
     * @param arrival
     * @param duration
     * @param from
     * @param to
     * @param price 
     */
    public FlightMock(int id,String airline, Date date, String departure,String arrival, String duration, String from, String to, String price){
        this.id=id;
        this.airline=airline;
        this.date=date;
        this.departure=departure;
        this.arrival=arrival;
        this.duration=duration;
        this.from=from;
        this.to=to;
        this.price=price;
    }
}
