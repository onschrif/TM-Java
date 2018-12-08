/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.pidev.tm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class MybdConnection1 {
     
     String url="jdbc:mysql://localhost:3306/paiement";
     String login="root";
     String pwd="";
    
     Connection mycon; 
     static MybdConnection1 instanceBD;
     
    private MybdConnection1(){
         try {
             mycon = DriverManager.getConnection(url, login, pwd);
             
             System.out.println("Connexion etablie !!! 😀 ");
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
    }
    
    public static MybdConnection1 getInstanceBD(){
    
        if(instanceBD==null) 
        instanceBD=new MybdConnection1();
        return instanceBD ;
    }
    
    public Connection getConnection(){
    return mycon;
    }
    
}
