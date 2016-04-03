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
public class Flight {
    public String id;
    public String airline;
    public Date date;
    public String departure;
    public String arrival;
    public String duration;
    public String from;
    public String to;
    public String price;
    
    public Flight(String id,String airline, Date date, String departure,String arrival, String duration, String from, String to, String price){
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
