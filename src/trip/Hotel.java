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
public class Hotel {
    public String id;
    public String name;
    public String city;
    public String price;
    public Date date;
    
    public Hotel(String id,String name,String city,String price, Date date){
        this.id = id;
        this.name = name;
        this.city = city;
        this.price = price;
        this.date = date;
    }
    
}
