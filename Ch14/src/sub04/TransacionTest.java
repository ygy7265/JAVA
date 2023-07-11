package sub04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * Transaction
 * - 트랜잭션은 DB처리의 최소작업단위로 하나의 작업은 소작업으로 구성
 * - 트랜잭션은 모두 성공 또는 모두 실패 해야됨
 * - commit은 모든 작업의 성공처리rollback은 모든 작업의 실패처리
 */
public class TransacionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Error generator ? ");
		int answer = sc.nextInt();
		
		String host = "jdbc:mysql://127.0.0.1:3306/bank";
		String user = "root";
		String pass = "root";
		String sql1 = "update `bank_account` set `a_balance` = `a_balance` - 10000 where `a_no` = ?";
		String sql2 = "update `bank_account` set `a_balance` = `a_balance` + 10000 where `a_no` = ?";
		Connection conn = null;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(host,user,pass);
			
			//수동으로 커밋처리 오류발생시 롤백을위함.
			conn.setAutoCommit(false);
			
			PreparedStatement pst = conn.prepareStatement(sql1);			
			PreparedStatement pst2= conn.prepareStatement(sql2);
			
			pst.setString(1, "101-11-1001");
			pst2.setString(1, "101-11-1003");
			
			pst.executeUpdate();
			if(answer == 1) {
				throw new Exception("Error");
			}
			pst2.executeUpdate();
			
			//위에코드에 문제가없으면 커밋.
			conn.commit();
			
			conn.close();
			pst.close();
			pst2.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try { //작업취소
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
