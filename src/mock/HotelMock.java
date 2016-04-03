/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import java.util.Date;

/**
 * Class for Hotel object
 * @author M
 */
public class HotelMock {
    public String id;
    public String name;
    public String city;
    public String price;
    public Date date;
    /**
     * Constructor
     * @param id
     * @param name
     * @param city
     * @param price
     * @param date 
     */
    public HotelMock(String id,String name,String city,String price, Date date){
        this.id = id;
        this.name = name;
        this.city = city;
        this.price = price;
        this.date = date;
    }
    
}
