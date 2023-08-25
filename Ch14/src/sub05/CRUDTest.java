package sub05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
/*SQL 조작어 클래스*/
class SQL{
	public final static String INSERT_USER  = "insert into `user3` values(?,?,?,?)";
	public final static String SELECT_USERS = "select * from `user1`";
	public final static String SELECT_USER  = "select * from `user1` where `uid`= ?";
	public final static String UPDATE_USER  = "update `user1` set `name` = ?,`hp`= ?,`age` = ? where `uid` = ?";
	public final static String DELETE_USER  = "delete from `user1` where `uid` = ?";
}
class UserVO{
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	public int getAge() {
		return age;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
		if(uid == null) {
			return "사용자 없음";
		}
		else
		{
		return uid+name+hp+age;
	
		}
	}
}
class UserDAO{
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {}
	private final String HOST = "jdbc:mysql://127.0.0.1:3306/userdb";
	private final String USER = "root";
	private final String PASS = "root";
	private Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(HOST,USER,PASS);
	}
	public void insertUser(UserVO vo) {
		try {
			conn = getConnection();
			pst = conn.prepareStatement(SQL.INSERT_USER);
			pst.setString(1, vo.getUid());
			pst.setString(2, vo.getName());
			pst.setString(3, vo.getHp());
			pst.setInt(4, vo.getAge());
			
			pst.executeUpdate();
			close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public UserVO selectUser(String uid) {
		UserVO vo = null;
		try {
			conn = getConnection();
			pst = conn.prepareStatement(SQL.SELECT_USER);
			pst.setString(1, uid);
			rs = pst.executeQuery();
			//UserVO vo = new UserVO();
			
			if(rs.next()) {
				vo = new UserVO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				
			}
				
			close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
		
	}
	public List<UserVO> selectUsers() {
		List<UserVO>users = new ArrayList<>();
		try {
			conn = getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(SQL.SELECT_USERS); 
			
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				users.add(vo);
			}	
			close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
		
	}
	public int updateUser(UserVO vo) {
		
		int result = 0;
		try {
			conn = getConnection();
			pst = conn.prepareStatement(SQL.UPDATE_USER);
			pst.setString(1, vo.getName());
			pst.setString(2, vo.getHp());
			pst.setInt(3, vo.getAge());
			pst.setString(4, vo.getUid());
			
			result = pst.executeUpdate();
			close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
		
	}
	public void deleteUser(String uid) {
		try {
			conn = getConnection();
			pst = conn.prepareStatement(SQL.DELETE_USER);
			pst.setString(1, uid);
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void close() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(st != null) {
			st.close();
		}
		if(pst != null) {
			pst.close();
		}
		if(conn != null) {
			conn.close();
		}
	}
}
public class CRUDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("end = 0\nInsert = 1\nAllselect = 2\nIdSelect= 3\nIdUdate = 4\nDelect = 5");
		int answer = sc.nextInt();
		
		while(true) {
			if(answer == 0) {
				break;
			}else if(answer == 1){
				UserVO vo = new UserVO();
				System.out.println("id");
				vo.setUid(sc.next());
				
				System.out.println("name");				
				vo.setName(sc.next());
				
				System.out.println("hp");			
				vo.setHp(sc.next());
				
				System.out.println("age");
				vo.setAge(sc.nextInt());
				
				UserDAO dao = UserDAO.getInstance();
				dao.insertUser(vo);
				
				System.out.println("insert sucess...");
			}else if(answer == 2) {				
				List<UserVO>users = UserDAO.getInstance().selectUsers();
				System.out.println("--------------SELECT------------------");
				for(UserVO user : users){
					System.out.println(user);
				}
			}else if(answer == 3) {
				System.out.print("id select");
				String uid = sc.next();
				UserVO user = UserDAO.getInstance().selectUser(uid);
				System.out.println("--------------SELECT------------------");
				System.out.println(user);
			}else if(answer == 4) {
				UserVO vo = new UserVO();
				System.out.print("update id insert :");				
				vo.setUid(sc.next());
				System.out.print("update name insert :");				
				vo.setName(sc.next());
				System.out.println("update hp insert :");				
				vo.setHp(sc.next());
				System.out.println("update age insert : ");
				vo.setAge(sc.nextInt());
	
				int result = UserDAO.getInstance().updateUser(vo);
				if(result > 0) {
					System.out.println("sucess");
				}
				else {
					System.out.println("Fail");
				}
			}else if(answer == 5) {
				UserVO vo = new UserVO();
				System.out.println("delete id insert");
				UserDAO.getInstance().deleteUser(sc.next());
			}
			
		}
		sc.close();
	}

}
