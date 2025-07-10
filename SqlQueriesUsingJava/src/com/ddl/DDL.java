package com.ddl;
import java.util.*;
public class DDL {
	private static Scanner c=new Scanner(System.in);
	private static StringBuilder sb=new StringBuilder();
	public static String createTable() {
		System.out.print("Enter the Table Name: ");
		String table_Name=c.nextLine();
		System.out.print("Enter the No. of Colums You Want To Create Table: ");
		int ncol=c.nextInt();
		c.nextLine();
		sb.append("create table "+table_Name+" ( ");
		for(int i=1;i<=ncol;i++) {
			System.out.print("Enter the "+i+" Column Name: ");
			String colNames=c.nextLine();
			sb.append(colNames).append(" varchar(25)");
			if(i<ncol) {
				sb.append(",");
			}
		}
		sb.append(");");
		return sb.toString();
	}
	public static String Alter_Table_Add() {
		System.out.print("Enter the Table Name: ");
		String table_Name=c.nextLine();
		sb.append("alter table ").append(table_Name).append(" add ( ");
		System.out.print("Enter the No. of Colums You Want To Add The Table: ");
		int ncol=c.nextInt();
		c.nextLine();
		for(int i=1;i<=ncol;i++) {
			System.out.print("Enter the Column Name: ");
			String col_Name=c.nextLine();
			sb.append(col_Name).append(" varchar(25)");
			if(i<ncol) {
				sb.append(",");
			}
		}
		sb.append(");");
		return sb.toString();
	}
	public static String Alter_Table_Modify() {
		System.out.print("Enter the Table Name: ");
		String table_Name=c.nextLine();
		sb.append("alter table ").append(table_Name);
		System.out.print("Enter the No. of Colums You Want To modify from Table: ");
		int ncol=c.nextInt();
		c.nextLine();
		for(int i=1;i<=ncol;i++) {
			System.out.print("Enter the Column Name: ");
			String col_Name=c.nextLine();
			System.out.print("Enter the return type for "+col_Name+": ");
			String return_Type=c.nextLine();
			sb.append(" modify column ").append(col_Name).append(" ").append(return_Type);
			if(i<ncol) {
				sb.append(",");
			}
		}
		sb.append(";");
		return sb.toString();
	}
	public static String Alter_Table_Drop() {
		System.out.print("Enter the Table Name: ");
		String table_Name=c.nextLine();
		sb.append("alter table ").append(table_Name);
		System.out.print("Enter the No. of Colums You Want To Drop From Table: ");
		int ncol=c.nextInt();
		c.nextLine();
		for(int i=1;i<=ncol;i++) {
			System.out.print("Enter the Column Name: ");
			String col_Name=c.nextLine();
			sb.append(" drop column  ").append(col_Name);
			if(i<ncol) {
				sb.append(",");
			}
		}
		sb.append(";");
		return sb.toString();
	}
	public static String Truncate() {
		System.out.print("Enter the Table Name: ");
		String table_Name=c.nextLine();
		sb.append("truncate table ").append(table_Name);
		return sb.toString();
	}
	public static String Drop() {
		System.out.print("Enter the Table Name: ");
		String table_Name=c.nextLine();
		sb.append("drop table ").append(table_Name);
		return sb.toString();
	}
	public static String Rename() {
		System.out.print("Enter the Old Table Name: ");
		String Old_Table_Name=c.nextLine();
		System.out.print("Enter the New Table Name: ");
		String New_Table_Name=c.nextLine();
		sb.append("rename table ").append(Old_Table_Name).append(" to ").append(New_Table_Name);
		return sb.toString();
	}
}
