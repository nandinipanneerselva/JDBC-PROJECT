package Busresv;


import java.sql.*;
public class DbConnection {
		
	private static final String url="jdbc:mysql://localhost:3306/busreser";
	private static final String username="root";
	private static final String passWord="ND24@inip";
	//this method just going to return connection object so that we are giving it as "Connection"
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,username,passWord);
	}
	}

