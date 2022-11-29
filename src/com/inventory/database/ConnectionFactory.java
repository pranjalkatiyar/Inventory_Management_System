
package com.inventory.database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectionFactory {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public ConnectionFactory(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ims","root","123456789");
            stmt=con.createStatement();
            System.out.println("Printed");
        }catch(Exception e){
            System.out.println("error created");
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ims","root","123456789");
        }catch(Exception e){

            e.printStackTrace();
        }
        return con;
    }

    public boolean checkLogin(String username,String password, String user){
        System.out.println(username+" "+password);
        String query="SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"' AND category='ADMINISTRATOR' LIMIT 1";
        try{
        rs=stmt.executeQuery(query);
            System.out.println("checked1");
            if(rs.next()){
                System.out.println("Username"+rs.getString("Username"));
                return true;
                }
        }catch(Exception e){
            System.out.println("checked4");
            e.printStackTrace();
        }
            
        return false;
    }
}
