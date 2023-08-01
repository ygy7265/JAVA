package vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	private String host = "jdbc:mysql://127.0.0.1:3306/userdb";
	private String user = "root";
	private String pass = "root";
	private PreparedStatement pst = null;
	
	public Connection connection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(host,user,pass);
		return conn;	
	}
	public void Delete(String table,String uid) throws ClassNotFoundException, SQLException {
		pst = connection().prepareStatement("delete from " + table +" `uid`= ?");
		pst.setString(1, uid);
		pst.executeUpdate();
		pst.close();
		connection().close();
	}
	
	public ResultSet select(String table) throws ClassNotFoundException, SQLException {
		PreparedStatement pst = connection().prepareStatement("select * from " + table);
		return pst.executeQuery();
	}
	
	public int Insert(String table, int uid,String name,String hp,int age) throws ClassNotFoundException, SQLException {
		pst = connection().prepareStatement("insert into "+ table + " values(?,?,?,?)");
		
		pst.setInt(1, uid);
		pst.setString(2, name);
		pst.setString(3, hp);
		pst.setInt(4, age);
		
		return pst.executeUpdate();
		
	}
}
