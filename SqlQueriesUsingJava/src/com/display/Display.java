package com.display;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.dbconnection.DBConnection;
import com.queries.CallQueries;

public class Display {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.getDBconnections();
		Statement state=DBConnection.stat(con);
			String query=CallQueries.DisplayOperation();
			if(!query.isEmpty()) {
				DBConnection.execute(state,query);
			}

	}

}
