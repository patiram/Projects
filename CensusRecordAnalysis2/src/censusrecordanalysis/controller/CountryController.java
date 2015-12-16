/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censusrecordanalysis.controller;

import static censusrecordanalysis.DatabaseConnection.conn;
import censusrecordanalysis.model.Country;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author PatiRam
 */
public class CountryController {
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    String dbUrl;
    String dbUsr;
    String dbPass;
    

    
    public ArrayList<Country> getCountry() throws ClassNotFoundException, SQLException {
       String query = "Select id,country_title FROM country" ;
       System.out.println(query);
        ArrayList<Country> lst=new ArrayList<Country>(); 
        
        conn = null;
        st = null;
        rs = null;
        //Connection static connection = 

        try {
            Connect a = new Connect();
            Statement stmt = a.connect().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                Country country=new Country();
                country.setId(rs.getInt(1));
                country.setCountryFullname(rs.getString(2));
                lst.add(country);
                
            }
            //a.connect().close();
           //a.connectClose(conn);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lst;
      }
    
}
