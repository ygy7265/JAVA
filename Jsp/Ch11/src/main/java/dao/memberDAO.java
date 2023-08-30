package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dto.memberDTO;

public class memberDAO {
	private final String HOST = "jdbc:mysql://15.164.164.198:3306/Farmstory";
	private final String USER = "farmstory";
	private final String PASS = "Qq12345!";
	
	public static memberDAO instance = new memberDAO();
	public static memberDAO getInstance() {
		return instance;
	}
	private memberDAO() {};
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public List<memberDTO> selectMembers() {
		List<memberDTO> list = new ArrayList<>();
		memberDTO dto = null;
		try {
			logger.info("Member List View..");
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM `Member`");
			while(rs.next()) {
				dto = new memberDTO();
				dto.setUid(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setHp(rs.getString(3));
				dto.setPos(rs.getString(4));
				dto.setDep(rs.getInt(5));
				dto.setDate(rs.getString(6));
				
				list.add(dto);
			}
			rs.close();
			conn.close();
			st.close();
		}catch(Exception e) {
			logger.error("Member List error =" + e.getMessage());
		}
		return list;
	}
	
	public void insertMember(memberDTO dto) {
		
		try {
			logger.info("Member List View..");
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement pst = conn.prepareStatement("INSERT INTO `Member` VALUES(?,?,?,?,?,NOW())");
			
			pst.setString(1,dto.getUid());
			pst.setString(2,dto.getName());
			pst.setString(3,dto.getHp());
			pst.setString(4,dto.getPos());
			pst.setInt(5,dto.getDep());	
			pst.executeUpdate();
			
			conn.close();
			pst.close();
		}catch(Exception e) {
			logger.error("Member Insert error =" + e.getMessage());
		}
	}
	
	
}
