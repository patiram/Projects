/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censusrecordanalysis.controller;

import static censusrecordanalysis.DatabaseConnection.conn;
import censusrecordanalysis.model.Houses;
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
public class HouseController {
    
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    String dbUrl;
    String dbUsr;
    String dbPass;
       
    public ArrayList<Houses> getHouseNos(int cityId) throws ClassNotFoundException, SQLException {
       // AddRecords test=new AddRecords();
       String query = "Select h.id,house_no FROM houses h, cities c where h.city_id=c.id AND h.city_id="+cityId;
       System.out.println(query);
        ArrayList<Houses> lst = new ArrayList<Houses>(); 
        
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
                Houses houses=new Houses();
                houses.setId(rs.getInt(1));
                houses.setHouseNo(rs.getString(2));
                lst.add(houses);
                System.out.println(lst);
             }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lst;
      }
    
}
