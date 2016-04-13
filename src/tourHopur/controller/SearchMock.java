package tourHopur.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import tourHopur.model.Tours;
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
public class SearchMock {
    private ArrayList<Tours> results;
    
    //public ArrayList<Tours> getResults(String dur, String type, String diff, String area , String lang, boolean pUp, boolean hCap, int date, int numberOfTickets){ 
    
    
    public ArrayList<Tours> getResults(){ 
    
        results = new ArrayList<Tours>();
        
        Tours tour1 = new Tours();
        tour1.setDuration(3);
        tour1.setType("Horse riding");
        tour1.setDifficulty("Easy");
        tour1.setArea("East");
         
        //tour1.setLanguage("english");
        tour1.setPickup(true);
        tour1.setHandicap(true);
        tour1.setDate("");
        tour1.setPrice(10000);
        //??
       
        
        results.add(0,tour1);
        
        Tours tour2= new Tours();
        tour2.setDuration(5);
        tour2.setType("Hiking");
        tour2.setDifficulty("Hard");
        tour2.setArea("West");
        String [] y = {"english"}; 
        //tour2.setLanguage("english");
        tour2.setPickup(false);
        tour2.setHandicap(false);
        tour2.setDate("");
        tour2.setPrice(13000);
        //?
        
        
        results.add(1,tour2);
        
        return results;
    }
}
