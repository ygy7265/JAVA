package sub03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/*
 * PrepareStatement 
 * -기존 Statement 보다 향상된 동적SQL생서을 위한Statement
 * -Query Parameter에 값을 Mapping 시켜 쿼리 실행
 * 
 * VO(Values Object)객체
 * -도메인 값을 속성을 갖는 객체
 * 
 */
//VO객체 : Table Entity가 변환되는 객체
class User2VO{
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class PrepareSelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String id = "root";
		String pass = "root";
		String sql = "select * from `user1`";
		List<User2VO> list = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host,id,pass);
			
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				
				User2VO vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				list.add(vo);
				
			}
			rs.close();
			conn.close();
			pst.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(User2VO vo : list) {
			System.out.print(vo.getUid());
			System.out.print(vo.getName());
			System.out.println(vo.getHp());
			System.out.println(vo.getAge());
		}
		
	}

}
