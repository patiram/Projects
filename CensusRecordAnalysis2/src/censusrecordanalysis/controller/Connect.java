/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censusrecordanalysis.controller;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;



/**
 *
 * @author PatiRam
 */
public class Connect {
    
    //public static java.sql.Connection conn;

    String dbUrl;
    String dbUsr;
    String dbPass;
    

    
    public Connection connect() throws ClassNotFoundException, SQLException {
        
        
        Connection conn = null;
        
        dbUrl = "jdbc:mysql://localhost:3306/census";
        dbUsr = "root";
        dbPass = "066bex425";
        //Connection static connection = 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver configured");

        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(dbUrl, dbUsr, dbPass);
            //return conn;
            System.out.println("Connected to the database");
            //conn.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
      }
    public void connectClose(Connection c) throws ClassNotFoundException, SQLException {
        c.close();
    }
}
