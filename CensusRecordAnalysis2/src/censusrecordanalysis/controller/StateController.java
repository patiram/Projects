/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censusrecordanalysis.controller;

import static censusrecordanalysis.DatabaseConnection.conn;
import censusrecordanalysis.model.Country;
import censusrecordanalysis.model.States;
import censusrecordanalysis.view.AddRecords;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author PatiRam
 */
public class StateController {
    
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    String dbUrl;
    String dbUsr;
    String dbPass;
    Country country;
    
    public ArrayList<States> getStates(int countryId) throws ClassNotFoundException, SQLException {
       // AddRecords test=new AddRecords();
       String query = "Select * FROM states where country_id="+countryId;
       System.out.println(query);
        ArrayList<States> lst = new ArrayList<States>(); 
        
        conn = null;
        st = null;
        rs = null;
        //Connection static connection = 

        try {
            Connect a = new Connect();
           
            Statement stmt = a.connect().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                States states=new States();
                states.setId(rs.getInt(1));
                states.setStateName(rs.getString(2));
                states.setCountryId(rs.getInt("country_id"));
                lst.add(states);
                System.out.println(lst);
            }
            //a.connectClose(conn);
             
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lst;
      }
    
}
