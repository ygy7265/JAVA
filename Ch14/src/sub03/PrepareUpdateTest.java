package sub03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareUpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String id = "root";
		String pass = "root";
		String sql = "update `user2` set `name`=?,`hp`=?,`age`= ? where `uid` = 'j101'";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host,id,pass);
			
			
			PreparedStatement pst = conn.prepareStatement(sql);
			
			
			pst.setString(1, "yousin");
			pst.setString(2, "112");
			pst.setInt(3, 26);
			pst.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
