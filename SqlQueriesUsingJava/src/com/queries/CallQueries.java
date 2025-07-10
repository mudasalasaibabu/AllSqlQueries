package com.queries;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.basiccommands.BasicCommands;
import com.dbconnection.*;
import com.ddl.DDL;
import com.dml.DML;
import com.dql.DQL;

public class CallQueries {
	private static Scanner c=new Scanner(System.in);
	static boolean exit=false;
public static String DisplayOperation() {
	String result="";
	while(!exit) {
		System.out.println("Select The Menu Operation!!!!");
		System.out.println("1.DDL OPERATIONS");
		System.out.println("2.DML OPERATIONS");
		System.out.println("3.DQL OPERATIONS");
		System.out.println("4.Basic Command OPERATIONS");
		System.out.println("5.Exit OPERATION");
		System.out.print("Enter The Choice: ");
		int choice=c.nextInt();
		c.nextLine();
		switch(choice) {
		case 1:	String r="";
				System.out.println("Select The DDL Operation!!!!");
				System.out.println("1.Creation");
				System.out.println("2.Alter");
				System.out.println("3.Truncate");
				System.out.println("4.Drop");
				System.out.println("5.Rename");
				System.out.println("6.Exit");
				System.out.print("Choose The DDL Operations: ");
				int choose=c.nextInt();
				switch(choose) {
				case 1:r=DDL.createTable();
						break;
				case 2: String ra="";
						System.out.println("Select The Alter Operation!!!!");
						System.out.println("1.Alter Add");
						System.out.println("2.Alter Modify");
						System.out.println("3.Alter Drop");
						System.out.println("4.Exit");
						System.out.print("Select The Alter Operations: ");
						int select=c.nextInt();
						switch(select) {
						case 1:ra=DDL.Alter_Table_Add();
								break;
						case 2:ra=DDL.Alter_Table_Modify();
								break;
						case 3:ra=DDL.Alter_Table_Drop();
								break;
						case 4:exit=true;
								System.out.println("Thank You ");
								break;		
						}
						r=ra;
						break;
				case 3:r=DDL.Truncate();
						break;
				case 4:r=DDL.Drop();
						break;
				case 5:r=DDL.Rename();
						break;
				case 6:exit=true;
						System.out.println("Thank You ");
						break;
				}
				result = r;
				break;
		case 2:	String m="";
				System.out.println("Select The DML Operation!!!!");
				System.out.println("1.Insert");
				System.out.println("2.Update");
				System.out.println("3.Delete");
				System.out.println("4.Exit");
				System.out.print("click The Option For DML Operations: ");
				int click=c.nextInt();
				switch(click) {
				case 1:m=DML.Insert();
						break;
				case 2:m=DML.Update();
						break;
				case 3:m=DML.Delete();
						break;
				case 4:exit=true;
						System.out.println("Thank You ");
						break;
				}
				result=m;
				break;
		case 3:DQL.Select();
				break;
		case 4:String b="";
				System.out.println("Select The Basic Commands Operation!!!!");
				System.out.println("1.Create DataBase");
				System.out.println("2.Use DataBase");
				System.out.println("3.Column Count And Names");
				System.out.println("4.Current DataBase");
				System.out.println("5.Show All DataBase");
				System.out.println("6.Delete DataBase");
				System.out.println("7.Show Tables");
				System.out.println("8.Exit");
				System.out.print("press The Option For DML Operations: ");
				int press=c.nextInt();
				switch(press) {
				case 1:b=BasicCommands.CreateDataBase();
					break;
				case 2:b=BasicCommands.UseDataBase();
					break;
				case 3:BasicCommands.CountColumnsAndNames();
					break;
				case 4:BasicCommands.CurrentDataBase();
				break;
				case 5:BasicCommands.AllDataBase();
				break;
				case 6:BasicCommands.DeleteDataBase();
				break;
				case 7:BasicCommands.ShowTables();
				break;
				case 8:exit=true;
				System.out.println("Thank You ");
				break;
		}
		result=b;
		break;
		case 5:exit=true;
				System.out.println("Thank You");
		}
}
	return result;
	}
	
}

