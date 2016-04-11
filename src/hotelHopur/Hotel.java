/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelHopur;

import java.beans.Statement;
/**
 *
 * @author Eiríkur Kristinn Hlöðversson, Háskóli Íslands, ekh9@hi.is
 */
public class Hotel {
    private int id;
    private String name;
    private String address;
    private int postcode;
    private String city;
    private String URL;
    private int Wifi;
    private int FreeWifi;
    private int Smoke;
    private int SPool;
    private int Gym;
    private int TV;


    /* Hotel is an object that contains all the details of a 
     * certain hotel from the database. 
     * id is the hotel id.
     * name is the name of the hotel
     * address is it's address and etc.
     */
    static Statement stmt = null;
    static String tmp;
    public Hotel(int a, String b, String c, int d, String e, String f,int g, int h, int i, int j, int k, int l){
            tmp = b.substring(0, b.length());
            id = a;
            name = b;
            address = c;
            postcode = d;
            city = e;
            URL = f;
            Wifi = g;
            FreeWifi=h;
            Smoke = i;
            SPool = j;
            Gym = k;
            TV =l;

    }

    String getName(){
            return name;
    }

    int getID(){
            return id;
    }

    String getAddress(){
            return address;
    }

    int getPostcode(){
            return postcode;
    }

    public String getCity(){
            return city;
    }

    String getURL(){
            return URL;
    }

    int getWifi(){

            return Wifi;
    }
    int getFreeWifi(){

            return FreeWifi;
    }
    int getSmoke(){

            return Smoke;
    }
    int getPool(){

            return SPool;
    }
    int getGym(){

            return Gym;
    }
    int getTV(){

            return TV;
    }

    /*
    int[] getPrice(){
            int ID = this.getID();
            int[] i = new int[6];
                    i =	sqlWorkBench.price(ID);
            return i;
    }
    */
}
