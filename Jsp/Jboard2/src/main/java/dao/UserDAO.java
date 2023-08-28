package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;

import ch.qos.logback.classic.spi.LoggerRemoteView;
import db.DBHelper;
import db.SQL;
import dto.UserDTO;

public class UserDAO extends DBHelper{
	
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() { return instance; }
	private UserDAO() {}
	Logger logger = LoggerFactory.getLogger(this.getClass());
	public int selectCountUid(String uid) {
		int result = 0;
		try{
			getConeecition();
			PreparedStatement pst = conn.prepareStatement(SQL.SELECT_COUNT_UID);
			pst.setString(1, uid);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()){
				 result = rs.getInt(1);
			}
			
			close();
		}catch(Exception e){
			logger.error("selcetcount uid error =" + e.getMessage());
		}
		return result;
	}
	public int selectCountNick(String nick) {
		int result = 0;
		try{
			getConeecition();
			PreparedStatement pst = conn.prepareStatement(SQL.SELECT_COUNT_NICK);
			pst.setString(1, nick);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()){
				 result = rs.getInt(1);
			}
			
			close();
		}catch(Exception e){
			logger.error("select nick error =" + e.getMessage());
		}
		return result;
	}
	public int selectCountEmail(String email) {
		int result = 0;
		try{
			Context initCtx = new InitialContext();
			Context ctx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) ctx.lookup("jdbc/jboard");
			Connection conn =  ds.getConnection();
			
			PreparedStatement pst = conn.prepareStatement(SQL.SELECT_COUNT_EMAIL);
			pst.setString(1, email);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()){
				 result = rs.getInt(1);
			}
			
			close();
		}catch(Exception e){
			logger.error("select count email List error =" + e.getMessage());
		}
		return result;
		
	}
	public int selectCountHp(String hp) {
		int result = 0;
		
		try{
			getConeecition();
			
			PreparedStatement pst = conn.prepareStatement(SQL.SELECT_COUNT_HP);
			pst.setString(1, hp);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()){
				 result = rs.getInt(1);
			}
			
			close();
		}catch(Exception e){
			logger.error("select count hp error =" + e.getMessage());
		}
		return result;
	}
	
	public void insertUser(UserDTO dto) {	
		int result = 0;
		try{
		conn = getConeecition();
		PreparedStatement psmt = conn.prepareStatement(SQL.INSERT_USER);
		psmt.setString(1, dto.getUid());
		psmt.setString(2, dto.getPass());
		psmt.setString(3, dto.getName());
		psmt.setString(4, dto.getNick());
		psmt.setString(5, dto.getEmail());
		psmt.setString(6, dto.getHp());
		psmt.setString(7, dto.getZip());
		psmt.setString(8, dto.getAddr1());
		psmt.setString(9, dto.getAddr2());
		psmt.setString(10, dto.getRegip());
		result = psmt.executeUpdate();
		
		close();
		}catch(Exception e){
			logger.error("insert user error =" + e.getMessage());
		}
	}
	
	public UserDTO selectUsers(String uid,String pass) {
		UserDTO dto = null;
		try{
		conn = getConeecition();
		
		pst = conn.prepareStatement(SQL.SELECT_USER);
		pst.setString(1, uid);
		pst.setString(2, pass);
		rs = pst.executeQuery();
		
		if(rs.next()){
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
		
		close();
		}catch(Exception e){
			logger.error("select users error =" + e.getMessage());
		}
		return dto;
	}
	public void updatetUser() {}	
	public void deleteUser() {}
}
