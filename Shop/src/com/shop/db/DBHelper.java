package com.shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
	private final String HOST = "jdbc:mysql://127.0.0.1:3306/shop";
	private final String USER = "root";
	private final String PASS = "root";
	protected Connection conn;
	protected Statement st;
	protected PreparedStatement pst;
	protected ResultSet rs;
	
	protected Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(HOST,USER,PASS);
	
	}
	
	protected void close() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(st != null) {
			st.close();
		}
		if(pst != null) {
			pst.close();
		}
		if(conn != null) {
			conn.close();
		}
	}
}
