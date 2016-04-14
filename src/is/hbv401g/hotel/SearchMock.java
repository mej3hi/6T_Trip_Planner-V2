/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hbv401g.hotel;

import java.util.ArrayList;


/**
 *
 * @author Eiríkur Kristinn Hlöðversson, Háskóli Íslands, ekh9@hi.is
 */
public class SearchMock {
     private ArrayList<Hotel> results;
    
    //public ArrayList<Tours> getResults(String dur, String type, String diff, String area , String lang, boolean pUp, boolean hCap, int date, int numberOfTickets){ 
    
    
    public ArrayList<Hotel> getResults(){ 
    
        results = new ArrayList<Hotel>();
        
        Hotel hotel1 = new Hotel(0, "Nordica", "Sudurlandsbr", 101, "Rvk", "", 0, 0, 0, 0, 0, 0);
        Hotel hotel2 = new Hotel(0, "101 Hotel", "Laugaveg", 101, "Rvk", "", 0, 0, 0, 0, 0, 0);
        
        results.add(0,hotel1);        
        results.add(1,hotel2);
        
        System.out.println("SearchMock"+ results);
        return results;
    }
}
