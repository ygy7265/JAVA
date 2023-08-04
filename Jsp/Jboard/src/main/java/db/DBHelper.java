package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBHelper {
	protected Connection conn = null;
	protected Statement st = null;
	protected PreparedStatement pst = null;
	protected ResultSet rs= null;
	
	public Connection getConeecition() {
		try {
		Context Ctx = (Context)new InitialContext().lookup("java:comp/env");
		DataSource ds = (DataSource) Ctx.lookup("jdbc/jboard");
		conn = ds.getConnection();
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		
		return conn;
	}
	
	public void close() throws SQLException {
		if(conn != null) {
			conn.close();
		}
		if(rs != null) {
			rs.close();
		}
		if(pst != null) {
			pst.close();
		}
		if(st != null) {
			st.close();
		}
		
	}
}
