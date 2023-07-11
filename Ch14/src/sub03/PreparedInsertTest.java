package sub03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedInsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String id = "root";
		String pass = "root";
		String sql = "insert into `user2` values(?,?,?,?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(host,id,pass);
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1,"j101");
			pst.setString(2,"gildong");
			pst.setString(3,"010-1234-3435");
			pst.setInt(4,23);
			
			pst.executeUpdate();
			
			con.close();
			pst.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
