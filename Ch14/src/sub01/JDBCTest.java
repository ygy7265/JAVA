package sub01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 2023/07/10 
 *
 */
public class JDBCTest {

	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "root";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  //Driver(로드)경로
			//데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			if(conn !=null){
				System.out.println("sucess");
			}else {
				System.out.println("fail");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
