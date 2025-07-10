package com.dql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import com.basiccommands.BasicCommands;
import com.dbconnection.DBConnection;
public class DQL {
	private static Scanner c=new Scanner(System.in);
	public static void Select(){
			try {
				System.out.print("Enter the Table Name: ");
				String s=c.nextLine();
				Connection con=DBConnection.getDBconnections();
				Statement stat=con.createStatement();
				ResultSet rs=stat.executeQuery("select * from "+s+";");
				int count=BasicCommands.getColumnCount(s);
				while(rs.next()) {
					for(int i=1;i<=count;i++){
					System.out.print(rs.getString(i)+" ");		
				}
					System.out.println();
				}
				System.out.println();
				}
			catch(Exception e) {
					e.printStackTrace();
				}
			}
}
