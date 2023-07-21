package test08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class User{
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return uid + "," + name + "," + hp + "," + age ;
	}
}
public class Test10 {
	private static String host = "jdbc:mysql://127.0.0.1:3306/userdb";
	private static String user = "root";
	private static String pass = "root";
	
	public static Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection(host,user,pass);
	}
	
	public static void main(String[] args) {
		query("insert into `user3` values('j101','honggildong','010-1111-1111',21)");
		List<User>result1 = query("select * from `user3`");
		List<User>result2 = query("select * from `user3` where `uid` = '1'");
		
		System.out.println("-------------------");
		System.out.println("result1 = ");
		for(User user : result1) {
			System.out.println(user);
		}
		
		System.out.println("-------------------");
		System.out.println("result2 = ");
		for(User user : result2) {
			System.out.println(user);
		}
	}
	public static List<User> query(String sql){
		List<User> users = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			stmt = getConnection().createStatement();
			
			if(sql.toLowerCase().startsWith("select")) {
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					User user = new User();
					user.setUid(rs.getString(1));
					user.setName(rs.getString(2));
					user.setHp(rs.getString(3));
					user.setAge(rs.getInt(4));
					
					users.add(user);
				}
			
			
			}
			} catch (Exception e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
		
		
		
	}
}
