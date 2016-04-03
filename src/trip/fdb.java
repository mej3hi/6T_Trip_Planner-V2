/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M
 */
public class fdb {
    
    // ---- Gagnagrunnur -----------------------------------
    // |id|Airline|Date|Departure|Arrival|Duration|From|To|Price|
    public static String[][] data = new String[][]{
        { "1","Wow", "03.03.2016", "12:00", "15:00", "3:00", "Rvk", "Aey","6.000"},
        { "2","IceAir", "03.03.2016", "18:00", "21:00", "3:00", "Rvk", "Aey","5.000"}
    };
    //-------------------------------------------------------
    
    public static Flight[] search(Date date, String from, String to){
        Flight[] flightobj = new Flight[2];
        int k=0;
        for(int i=0; i<data.length; i++){
            if(date.compareTo(std(data[i][2]))==0 && data[i][6].toLowerCase().equals(from.toLowerCase()) && data[i][7].toLowerCase().equals(to.toLowerCase())){
                flightobj[k]= new Flight(data[i][0],data[i][1],std(data[i][2]),data[i][3],data[i][4],data[i][5],data[i][6],data[i][7],data[i][8]);
                k++;
            }   
        }
        if(k == 0) return null;
        return flightobj;
    }
    
    public static Date std(String string){
        DateFormat format = new SimpleDateFormat("MM.d.yyyy", Locale.ENGLISH);
        Date date = null;
        try {
            date = format.parse(string);
        } catch (ParseException ex) {
            Logger.getLogger(fdb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }
    
}
