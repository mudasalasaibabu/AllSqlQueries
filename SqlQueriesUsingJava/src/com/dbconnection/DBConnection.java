package com.dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.credentials.MyCredentials;
public class DBConnection {
public static Connection getDBconnections() throws SQLException{
	Connection con=DriverManager.getConnection(MyCredentials.url,MyCredentials.user_Name,MyCredentials.password);
	System.out.println("Connection Sucessfully");
	return con;
}
public static Statement stat(Connection con) throws SQLException {
	Statement stat=con.createStatement();
	return stat;
}
public static void execute(Statement stat, String query) throws SQLException {
	stat.execute(query);
	System.out.println(query);
	System.out.println("Operation Successfull");
	
}
}
