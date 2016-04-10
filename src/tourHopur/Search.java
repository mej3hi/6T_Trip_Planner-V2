/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourHopur;

import java.util.ArrayList;

/**
 *
 * @author Eiríkur Kristinn Hlöðversson, Háskóli Íslands, ekh9@hi.is
 * 
 * 
 * 
 * 
 * Svona verður þetta hjá þeim og við sendum tóma strenginn ef við viljum 
 * ekki leita eftir einhverju ákveðnu.
 */
public class Search {
    private ArrayList<Tours> results;
    
    //public ArrayList<Tours> getResults(String dur, String type, String diff, String area , String lang, boolean pUp, boolean hCap, int date, int numberOfTickets){ 
    
    
    public ArrayList<Tours> getResults(){ 
    
        results = new ArrayList<Tours>();
        
        Tours tour1 = new Tours();
        tour1.setDuration(3);
        tour1.setType("Horse riding");
        tour1.setDifficulty("Easy");
        tour1.setArea("East");
        String [] l = {"english"}; 
        tour1.setLanguage(l);
        tour1.setPickup(true);
        tour1.setHandicap(true);
        tour1.setDate(120314);
        tour1.setPrice(10000);
        //??
        tour1.setSeatsT(30);
        
        results.add(0,tour1);
        
        Tours tour2= new Tours();
        tour2.setDuration(5);
        tour2.setType("Hiking");
        tour2.setDifficulty("Hard");
        tour2.setArea("West");
        
        tour2.setLanguage(l);
        tour2.setPickup(false);
        tour2.setHandicap(false);
        tour2.setDate(160314);
        tour2.setPrice(13000);
        //?
        tour2.setSeatsT(30);
        
        results.add(1,tour2);
        
        return results;
    }
}
