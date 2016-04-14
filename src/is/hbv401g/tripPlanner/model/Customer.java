/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hbv401g.tripPlanner.model;

/**
 *
 * @author 6T_Trip_planner group
 */
public class Customer {
    private String name;
    private String ssn;
    private int phone;
    
    
    
    public Customer(){
        this.name = "";
        this.ssn = "";
        this.phone = 0;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setSsn(String ssn){
        this.ssn=ssn;
    }
    
    public String getSsn(){
        return ssn;
    }
    
    public void setPhone(int phone){
        this.phone=phone;
    }
    
    public int getPhone(){
        return phone;
    }
}
