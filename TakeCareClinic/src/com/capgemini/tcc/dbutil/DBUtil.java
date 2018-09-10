package com.capgemini.tcc.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn=null;
	public static Connection getConnection() throws SQLException{
conn=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg202","training202");
		
		return conn;
	}

}
