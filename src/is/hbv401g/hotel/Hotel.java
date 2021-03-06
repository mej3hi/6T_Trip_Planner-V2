/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hbv401g.hotel;

import java.beans.Statement;
/**
 *
 * @author Hotel Group
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
    private int roomPrice1;
    private int roomPrice2;
    private int roomPrice3;
    private int roomCount1;
    private int roomCount2;
    private int roomCount3;
    private int OrderPrice;


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

    public String getName(){
            return name;
    }

    public int getID(){
            return id;
    }

    public String getAddress(){
            return address;
    }

    public int getPostcode(){
            return postcode;
    }

    public String getCity(){
            return city;
    }

    public String getURL(){
            return URL;
    }

    public int getWifi(){

            return Wifi;
    }
    public int getFreeWifi(){

            return FreeWifi;
    }
    public int getSmoke(){

            return Smoke;
    }
    public int getPool(){

            return SPool;
    }
    public int getGym(){

            return Gym;
    }
    public int getTV(){

            return TV;
    }

    
    
    int getPriceOfRoomType1(){

            return roomPrice1;
    }

    int getPriceOfRoomType2(){

            return roomPrice2;
    }

    int getPriceOfRoomType3(){

            return roomPrice3;
    }
    int getRoomType1Count(){

            return roomCount1;
    }
    int getRoomType2Count(){

            return roomCount2;
    }
    int getRoomType3Count(){

            return roomCount3;
    }


    void setPriceOfRoomType1(int x){

            roomPrice1=x;
    }

    void setPriceOfRoomType2(int x){

            roomPrice2=x;
    }

    void setPriceOfRoomType3(int x){

            roomPrice3=x;
    }
    void setRoomType1Count(int x){

            roomCount1 = x;
    }
    void setRoomType2Count(int x){

            roomCount2 = x;
    }
    void setRoomType3Count(int x){

            roomCount3 = x;
    }

    //Þessi föll er hægt að kalla á til þess að reikna verðið á pöntuninni.
    public int getOrderPriceRoomType1(int nrClients, int nrRooms){
            if(nrClients == nrRooms){
                    OrderPrice = (int) (nrClients*nrRooms*roomPrice1*0.8);
            }else{
                    OrderPrice=nrClients*nrRooms*roomPrice1;
            }
            return OrderPrice;
    }
    public int getOrderPriceRoomType2(int nrClients, int nrRooms){
            if(nrClients == nrRooms){
                    OrderPrice = (int) (nrClients*nrRooms*roomPrice2*0.8);
            }else{
                    OrderPrice=nrClients*nrRooms*roomPrice2;
            }
            return OrderPrice;
    }
    public int getOrderPriceRoomType3(int nrClients, int nrRooms){
            if(nrClients == nrRooms){
                    OrderPrice = (int) (nrClients*nrRooms*roomPrice3*0.8);
            }else{
                    OrderPrice=nrClients*nrRooms*roomPrice3;
            }
            return OrderPrice;
    }
    
}
