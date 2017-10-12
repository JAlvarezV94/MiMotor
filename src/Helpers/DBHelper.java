package Helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	
	private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/databaseName=MiMotor";
	private static final String USER = "root";
	private static final String PASS = "";
	
	public static Connection getConnection() {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(CONNECTION_STRING,USER,PASS);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	
	public static void closingConection(Connection con) {
		
		if(con!=null) {
			try {
				if(!con.isClosed())
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
