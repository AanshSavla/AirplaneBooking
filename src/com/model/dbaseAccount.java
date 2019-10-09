
package com.model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class dbaseAccount {
    String dbusername = "root";
    String dbpassword = "";
    String dburl = "jdbc:mysql://localhost:3306/mytravelagency";
    String dbdriver = "com.mysql.jdbc.Driver";
    Connection dbcon;
    
    
    void dbConnect() throws ClassNotFoundException,SQLException
    {
        dbcon = (Connection) DriverManager.getConnection(dburl, dbusername, dbpassword);
    }  
    
    void dbclose() throws SQLException
    {
        dbcon.close();
    }
    
    public ResultSet getSourceCity() throws ClassNotFoundException, SQLException
    {
        dbConnect();
        String sql = "select distinct source from flight";
        PreparedStatement pstmt =(PreparedStatement) dbcon.prepareStatement(sql);
        ResultSet rst = pstmt.executeQuery();
      
        return (rst);
    }
    
     public ResultSet getDestinationCity() throws ClassNotFoundException, SQLException
    {
        dbConnect();
        String sql = "select distinct destination from flight";
        PreparedStatement pstmt =(PreparedStatement) dbcon.prepareStatement(sql);
        ResultSet rst = pstmt.executeQuery();
      
        return (rst);
    }
    
    public ResultSet getDepartureFlight(String s,String d) throws ClassNotFoundException, SQLException
    {
        dbConnect();
        String sql = "select * from flight where source = " + "'" + s + "'" + "and destination =" + "'" + d + "'";
        PreparedStatement pstmt = (PreparedStatement) dbcon.prepareStatement(sql);
        ResultSet rst = pstmt.executeQuery();
        return(rst);
    }
}
