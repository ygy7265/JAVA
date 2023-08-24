package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.User1DTO;

public class User1DAO {
	/**
	 * 
	 */
	private final String HOST = "jdbc:mysql://15.164.164.198:3306/UserDB";
	private final String USER = "root";
	private final String PASS = "Dmsdud4035!@!@";
	public void insertUser1(User1DTO dto) {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement pst = conn.prepareStatement("INSERT INTO `User1` VALUES(?,?,?,?)");
			pst.setString(1, dto.getUid());
			pst.setString(2, dto.getName());
			pst.setString(3, dto.getHp());
			pst.setInt(4, dto.getAge());
			pst.executeUpdate();
			
			conn.close();
			pst.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public User1DTO selectUser1(String uid) {
		User1DTO dto = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM `User1` where `uid` = ?");
			pst.setString(1, uid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				dto = new User1DTO();
				dto.setUid(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setHp(rs.getString(3));
				dto.setAge(rs.getString(4));
			}
			rs.close();
			conn.close();
			pst.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	public List<User1DTO> selectUser1s() {
		List<User1DTO> list = new ArrayList<>();
		User1DTO dto = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM `User1`");
			while(rs.next()) {
				dto = new User1DTO();
				dto.setUid(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setHp(rs.getString(3));
				dto.setAge(rs.getString(4));
				
				list.add(dto);
			}
			rs.close();
			conn.close();
			st.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void updateUser1(User1DTO dto) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement pst = conn.prepareStatement("UPDATE `User1` SET "
					+ "uid = ?,"
					+ "name = ?,"
					+ "hp = ?,"
					+ "age = ? "
					+ "where `uid` = ?");
			pst.setString(1,dto.getUid());
			pst.setString(2,dto.getName());
			pst.setString(3,dto.getHp());
			pst.setInt(4,dto.getAge());
			pst.setString(5,dto.getUid());
			pst.executeUpdate();
			pst.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void deleteUser1(String uid) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement pst = conn.prepareStatement("DELETE FROM `User1` where `uid` = ?");
			pst.setString(1, uid);
			pst.executeUpdate();
		
			
			conn.close();
			pst.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
