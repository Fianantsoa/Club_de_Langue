/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package club_de_langue;

import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    private static final String sql= "com.mysql.jdbc.Driver";
    private static final String host= "jdbc:mysql://localhost:3306";
    private static final String user= "root";
    private static final String password= "";
	
    public static void Charge() throws ClassNotFoundException{
	Class.forName(sql);
    }
	
    public static Connection getConnection() throws SQLException{
    	return DriverManager.getConnection(host, user, password);
    }
	
    public ConnectionDb() {
		 
    }

    Cursor createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
