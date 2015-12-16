/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censusrecordanalysis.controller;
import censusrecordanalysis.model.LoginModel;
import static censusrecordanalysis.DatabaseConnection.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


/**
 *
 * @author PatiRam
 */
public class LoginController {
    

    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    String dbUrl;
    String dbUsr;
    String dbPass;
    

    
    public boolean checkUser(LoginModel user) throws ClassNotFoundException, SQLException {
       String query = "Select * FROM users WHERE username ='" + user.getUserName() 
                + "' AND password ='" + user.getPassword() + "'";
       System.out.println(query);
        
        
        conn = null;
        st = null;
        rs = null;
        //Connection static connection = 

        try {
            Connect a = new Connect();
            
            Statement stmt = a.connect().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
               return true;
             }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
      }
} 
