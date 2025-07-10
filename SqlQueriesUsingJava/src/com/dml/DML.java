package com.dml;
import java.util.Scanner;
import com.basiccommands.BasicCommands;
public class DML {
	private static Scanner c=new Scanner(System.in);
	private static StringBuilder sb=new StringBuilder();
public static String Insert() {
	System.out.print("Enter the Table Name: ");
	String s=c.nextLine();
	int column_Count=BasicCommands.getColumnCount(s);
	String column_Names[]=BasicCommands.getColumnNames(s);
	System.out.print("Enter How Many of Memebers Details You Wanted To Entered: ");
	int h=c.nextInt();
	c.nextLine();
	sb.append("insert into ").append(s).append(" values ");
	for(int i=1;i<=h;i++) {
		sb.append(" ( ");
		for(int j=0;j<column_Names.length;j++) {
			System.out.print("Enter The Value For Column "+column_Names[j]+" : ");
			String z=c.nextLine();
			sb.append("'").append(z).append("'");
			if(j<column_Names.length-1) {
				sb.append(",");
			}
		}
		sb.append(" ) ");
		if(i<h){
			sb.append(",");
		}
	}
	sb.append(";");
	return sb.toString();
	}
public static String Update() {
	System.out.print("Enter the Table Name: ");
	String str=c.nextLine();
	System.out.print("Enter the No of columns You Wnat To Update : ");
	int m=c.nextInt();
	c.nextLine();
	sb.append("update ").append(str).append(" set ");
	for(int i=1;i<=m;i++) {
		System.out.print("Enter the Column Name Where You Want To Update: ");
		String s3=c.nextLine();
		System.out.print("Enter the New Value Based On "+s3+" : ");
		String s1=c.nextLine();
	sb.append(s3).append(" = '").append(s1).append("' ");
	if(i<m) {
		sb.append(", ");
	}
	}
	System.out.print("Enter the Column Name Based On Update Reference: ");
	String s4=c.nextLine();
	System.out.print("Enter the Value From "+s4+" Where You Want To Update: ");
	String n=c.nextLine();
	sb.append(" where ").append(s4).append("  = '").append(n).append("';");
	return sb.toString();
}
public static String Delete() {
	System.out.print("Enter the Table Name: ");
	String s=c.nextLine();
	System.out.print("Enter the Column Name Based On Delete Operation: ");
	String s1=c.nextLine();
	System.out.print("Enter the "+s1+" Where You Want To Delete the Row: ");
	String n=c.nextLine();
	sb.append("Delete from ").append(s).append(" where "+s1+" = '").append(n).append("';");
	return sb.toString();
}
}
