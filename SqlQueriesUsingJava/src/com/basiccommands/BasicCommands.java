package com.basiccommands;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;
import com.dbconnection.DBConnection;
public class BasicCommands {
	private static Scanner c=new Scanner(System.in);
	private static StringBuilder sb=new StringBuilder();
public static String CreateDataBase() {
	System.out.print("Enter the DataBase Name: ");
	String data_Base_Name=c.nextLine();
	sb.append("create database ").append(data_Base_Name);
	return sb.toString();
}
public static String UseDataBase() {
		System.out.print("Enter the DataBase Name: ");
		String data_Base_Name=c.nextLine();
		sb.append("use ").append(data_Base_Name);
		return sb.toString();
}
public static void CurrentDataBase() {
	try {
		Connection con=DBConnection.getDBconnections();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select database();");
		rs.next();
	 String r=rs.getString(1);
	 if(r!=null) {
		System.out.println("Cuurent DataBase:  "+r);

		System.out.println();
	 }else {
		 System.out.println("DB is created");
	 }
		}catch(Exception e) {
		System.out.println("Please Check Some Exceptions Occur");

		System.out.println();}
}
public static void AllDataBase() {
	try {
	Connection con=DBConnection.getDBconnections();
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery("show databases");
	while(rs.next()) {
		System.out.println(rs.getString(1));
	}
	}catch(Exception e) {
		System.out.println("Some Exceptions Are Raises");
	}
}
public static void DeleteDataBase() {
	System.out.print("How Many DataBase You Want To Delete: ");
	int n=c.nextInt();
	c.nextLine();
	try {
		Connection con=DBConnection.getDBconnections();
		Statement stat=con.createStatement();
	for(int i=1;i<=n;i++) {
		System.out.print("Enter The Name Of The DataBase: ");
		String dataBase=c.nextLine();
		String query = "DROP DATABASE " + dataBase;
		stat.execute(query);
		System.out.println("Deleted database: " + dataBase);
	}
	
}catch(Exception e) {
	e.printStackTrace();
}
}
public static int getColumnCount(String s) {
	try {
		Connection con=DBConnection.getDBconnections();
		Statement stat=con.createStatement();
		ResultSet rs=stat.executeQuery("select * from "+s);
		ResultSetMetaData md=rs.getMetaData();
		int count=md.getColumnCount();
		return count;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
public static String[] getColumnNames(String s) {
	try {
	Connection con=DBConnection.getDBconnections();
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery("select * from "+s);
	ResultSetMetaData md=rs.getMetaData();
	int count=md.getColumnCount();
	System.out.println("Number Of Columns In a Particular Table: "+count);
	String names[]=new String[count];
	for(int i=0;i<count;i++) {
	names[i]=md.getColumnName(i+1);
	}
return names;
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
	
}
public static void CountColumnsAndNames() {
	try {
	System.out.print("Enter the Table Name: ");
	String s=c.nextLine();
	Connection con=DBConnection.getDBconnections();
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery("select * from "+s);
	ResultSetMetaData md=rs.getMetaData();
	int count=md.getColumnCount();
	System.out.println("Number Of Columns In a Particular Table: "+count);
	System.out.print("Table Names: ");
	for(int i=1;i<=count;i++) {
	System.out.print( md.getColumnName(i)+" ");
	}
	System.out.println();
	System.out.println();
	System.out.println();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public static void ShowTables() {
	try {
	Connection con=DBConnection.getDBconnections();
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery("show tables");
	System.out.println("Tables!!!");
	while(rs.next()) {
		System.out.println(rs.getString(1));
	}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
