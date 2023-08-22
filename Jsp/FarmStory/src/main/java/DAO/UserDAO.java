package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB.DBHellper;
import DB.SQL;
import DTO.UserDTO;

public class UserDAO extends DBHellper{
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {return instance;}
	private UserDAO() {}
	public void insertUser(UserDTO dto) {
		conn = getConnection();
		try {
			pst = conn.prepareStatement(SQL.INSERT_USER);
			pst.setString(1, dto.getUid());
			pst.setString(2, dto.getPass());
			pst.setString(3, dto.getName());
			pst.setString(4, dto.getNick());
			pst.setString(5, dto.getEmail());
			pst.setString(6, dto.getHp());
			pst.setString(7, dto.getZip());
			pst.setString(8, dto.getAddr1());
			pst.setString(9, dto.getAddr2());
			pst.setString(10, dto.getRegip());
			
			pst.executeUpdate();			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public UserDTO Login(String uid,String pass) {
		conn = getConnection();
		UserDTO dto = null;
		try {
			pst = conn.prepareStatement(SQL.Login_User);
			pst.setString(1, uid);
			pst.setString(2, pass);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				dto = new UserDTO();
				dto.setUid(rs.getString(1));
				dto.setPass(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setNick(rs.getString(4));
				dto.setEmail(rs.getString(5));
				dto.setHp(rs.getString(6));
				dto.setRole(rs.getString(7));
				dto.setZip(rs.getString(8));
				dto.setAddr1(rs.getString(9));
				dto.setAddr2(rs.getString(10));
				dto.setRegip(rs.getString(11));
				dto.setRegDate(rs.getString(12));
				dto.setLeaveDate(rs.getString(13));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	public List<UserDTO> UesrList() {
		UserDTO dto = null;
		List<UserDTO> list = new ArrayList<>();
		conn = getConnection();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(SQL.SELECT_USER_LIST);
			
			while(rs.next()) {
				dto = new UserDTO();
				dto.setUid(rs.getString(1));
				dto.setPass(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setNick(rs.getString(4));
				dto.setEmail(rs.getString(5));
				dto.setHp(rs.getString(6));
				dto.setRole(rs.getString(7));
				dto.setZip(rs.getString(8));
				dto.setAddr1(rs.getString(9));
				dto.setAddr2(rs.getString(10));
				dto.setRegip(rs.getString(11));
				dto.setRegDate(rs.getString(12));
				dto.setLeaveDate(rs.getString(13));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
