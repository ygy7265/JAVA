package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "root";
		String sql = "select * from `user1` where `uid` = 'A101'";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			//select 
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.printf("%s,%s,%s,%d\n",id,name,hp,age);
			}
			rs.close();
			st.close();
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
