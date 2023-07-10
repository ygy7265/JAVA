package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "root";
		
		try {
			//step1 driver load
			Class.forName("com.mysql.jdbc.Driver");
			//step2 mysql connector
			Connection conn = DriverManager.getConnection(host,user,pass);
			//step3 Object add 
			Statement st = conn.createStatement();
			//step4 SQL run
			String sql = "insert into `user2` values('j101','kimyousin','010-1234-1001',26);";
			st.executeUpdate(sql);
			//step5 
			
			//step6
			st.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("suce");
	}

}
