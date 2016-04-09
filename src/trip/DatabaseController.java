/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author M
 */
public class DatabaseController {
    public static void insertInto(String table, String[] param, Customer customer, String type, int id){
        //if(param.length==0) return;
        String q ="(?";
        String p =" ("+param[0];
        for(int i=1; i<param.length; i++){
            q+=",?";
            p+=","+param[i];
        }
        q+=")";
        p+=")";
        //System.out.println(q);
        //System.out.println(p);
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:data.db");
            PreparedStatement statement = con.prepareStatement(
                "INSERT INTO "+table+p+"VALUES"+q);
            statement.setString(1,customer.getName());
            statement.setString(2,customer.getSsn());
            statement.setInt(3,customer.getPhone());
            statement.setString(4,type);
            statement.setInt(5,id);

            statement.executeUpdate();   
        }
        catch(Exception e){
            System.out.println(e);  
        }
    }
}
