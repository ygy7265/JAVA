package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "jdbc:mysql://127.0.0.1:3306/userdb";
		String id = "root";
		String pass = "root";
		String sql = "update `user1` set `age` = 20 where `uid` = 'A101'";
		String select = "select * from `user1` where `name` = '이순신'";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(path,id,pass);
			
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
			
			ResultSet rs = st.executeQuery(select);
			while(rs.next()) {
				String id1 = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.printf("%s,%s,%s,%d\n",id1,name,hp,age);
			}
			
			st.close();
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
