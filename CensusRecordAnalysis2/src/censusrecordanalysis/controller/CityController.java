/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censusrecordanalysis.controller;

import static censusrecordanalysis.DatabaseConnection.conn;
import censusrecordanalysis.model.Cities;
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
public class CityController {
    
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    String dbUrl;
    String dbUsr;
    String dbPass;
       
    public ArrayList<Cities> getCities(int countryId, int stateId) throws ClassNotFoundException, SQLException {
       // AddRecords test=new AddRecords();
       String query = "Select c.id,city_name FROM states s,cities c where c.state_id=s.id and s.country_id= "+countryId+" AND c.state_id="+stateId;
       System.out.println(query);
        ArrayList<Cities> lst = new ArrayList<Cities>(); 
        
        conn = null;
        st = null;
        rs = null;
        //Connection static connection = 

        try {
            Connect a = new Connect();
           
            Statement stmt = a.connect().createStatement();
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                Cities cities=new Cities();
                cities.setId(rs.getInt(1));
                cities.setCityName(rs.getString(2));
                lst.add(cities);
                System.out.println(lst);
             }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lst;
      }
    
}
