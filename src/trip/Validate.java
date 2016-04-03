/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

/**
 *
 * @author Eiríkur Kristinn Hlöðversson, Háskóli Íslands, ekh9@hi.is
 */
public class Validate {
    
    public boolean name(String name){
        if(!(name.length()>2 && name.length()<25))
            return false;
        else if(!name.matches("[a-zA-Z áÁíÍöÖðÐþÞúÚéÉæÆóÓ]+"))
            return false;
        return true;
    }
    
    public boolean phone(int phone){
        return 7==numofdigits(phone);
    }
    
    public boolean ssn(int ssn){
        return (""+ssn).matches("[0123][0-9][01][0-9][0-9][0-9][0-9]{4}");
    }
    
    public int numofdigits(int x){
        if(x/10!=0) return numofdigits(x/10)+1;
        return 1;
    }
    
    
    
}
