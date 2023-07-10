package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "jdbc:mysql://127.0.0.1:3306/userdb";
		String id = "root";
		String pass = "root";
		String sql = "delete from `user2` where `name` = 'yousin3'";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(path,id,pass);
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
			
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
