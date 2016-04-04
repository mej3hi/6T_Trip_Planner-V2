/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

/**
 *
 * @author M
 */
public class Customer {
    private String name;
    private String id;
    private int phone;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setPhone(int phone){
        this.phone=phone;
    }
    
    public int getPhone(){
        return phone;
    }
}
