package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import db.DBHelper;
import db.SQL;
import vo.UserVo;

public class UserDao extends DBHelper{
	
	private static UserDao instance = new UserDao();
	public static UserDao getInstance() { return instance; }
	private UserDao() {}

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
			e.printStackTrace();
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
			e.printStackTrace();
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
			e.printStackTrace();
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
			e.printStackTrace();
		}
		return result;
	}
	
	public void insertUser(UserVo vo) {	
		int result = 0;
		try{
		conn = getConeecition();
		PreparedStatement psmt = conn.prepareStatement(SQL.INSERT_USER);
		psmt.setString(1, vo.getUid());
		psmt.setString(2, vo.getPass());
		psmt.setString(3, vo.getName());
		psmt.setString(4, vo.getNick());
		psmt.setString(5, vo.getEmail());
		psmt.setString(6, vo.getHp());
		psmt.setString(7, vo.getZip());
		psmt.setString(8, vo.getAddr1());
		psmt.setString(9, vo.getAddr2());
		psmt.setString(10, vo.getRegip());
		result = psmt.executeUpdate();
		
		close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public UserVo selectUsers(String uid,String pass) {
		UserVo vo = null;
		try{
		conn = getConeecition();
		
		pst = conn.prepareStatement(SQL.SELECT_USER);
		pst.setString(1, uid);
		pst.setString(2, pass);
		rs = pst.executeQuery();
		
		if(rs.next()){
			vo = new UserVo();
			vo.setUid(rs.getString(1));
			vo.setPass(rs.getString(2));
			vo.setName(rs.getString(3));
			vo.setNick(rs.getString(4));
			vo.setEmail(rs.getString(5));
			vo.setHp(rs.getString(6));
			vo.setRole(rs.getString(7));
			vo.setZip(rs.getString(8));
			vo.setAddr1(rs.getString(9));
			vo.setAddr2(rs.getString(10));
			vo.setRegip(rs.getString(11));
			vo.setRegDate(rs.getString(12));
			vo.setLeaveDate(rs.getString(13));
		}
		
		close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return vo;
	}
	public void updatetUser() {}	
	public void deleteUser() {}
}
