package censusrecordanalysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PatiRam
 */
public class DatabaseConnection {

    private static DatabaseConnection databaseObj = null;
    public static Connection conn;
    //Statement st;
    //ResultSet rs;
    PreparedStatement pst;
    ResultSet rs;
    String dbUrl;
    String dbUsr;
    String dbPass;

    protected DatabaseConnection() {
    }

    public Connection getConnection() {
        conn = null;
        //st = null;
        //rs = null;
        dbUrl = "jdbc:mysql://localhost:3306/census";
        dbUsr = "root";
        dbPass = "066bex425";
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver configured");

        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(dbUrl, dbUsr, dbPass);
            System.out.println("Connected to the database");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    public Boolean checkLogin(String uname, String pwd) {
        try {

            pst.setString(1, uname); //this replaces the 1st  "?" in the query for username
            pst.setString(2, pwd);    //this replaces the 2st  "?" in the query for password
            //executes the prepared statement
            rs = pst.executeQuery();
            if (rs.next()) {
                //TRUE iff the query founds any corresponding data
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating" + e);
            return false;
        }

    }
}
