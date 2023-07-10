package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String root = "root";
		String pass = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host,root,pass);
			Statement st = conn.createStatement();
			String sql = "update `user2` set `name` = 'yousin3' where `name` = 'yousin2'";
			st.executeUpdate(sql);
			conn.close();
			st.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
