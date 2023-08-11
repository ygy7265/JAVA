package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import db.SQL;
import vo.ArticleVo;
import vo.UserVo;

public class ArticleDAO extends DBHelper{
	public void insertAticle(ArticleVo vo) {

		try {
			conn = getConeecition();
			pst= conn.prepareStatement(SQL.INSERT_WRITER);
			pst.setString(1, vo.getTitle());
			pst.setString(2, vo.getContent());
			pst.setString(3, vo.getWriter());
			pst.setString(4, vo.getRegip());
			pst.executeUpdate();
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public ArticleVo selectAticle(String no) {
		conn = getConeecition();
		ArticleVo vo = new ArticleVo();
		try {
			pst = conn.prepareStatement(SQL.SELECT_ARPICLE_NO );
			pst.setString(1, no);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				
				vo.setNo(rs.getInt(1));
				vo.setParent(rs.getInt(2));
				vo.setComment(rs.getInt(3));
				vo.setCate(rs.getString(4));
				vo.setTitle(rs.getString(5));
				vo.setContent(rs.getString(6));
				vo.setFile(rs.getInt(7));
				vo.setHit(rs.getInt(8));
				vo.setWriter(rs.getString(9));
				vo.setRegip(rs.getString(10));
				vo.setRdate(rs.getString(11));
				
			}
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	
	public List<ArticleVo> selectAticles(int start) {
		List<ArticleVo> list = new ArrayList<>();
		try{
			conn = getConeecition();
			pst = conn.prepareStatement(SQL.SELECT_ARTICLES);
			pst.setInt(1, start);
			rs = pst.executeQuery();
			
			while(rs.next()) {
			ArticleVo vo = new ArticleVo();
			
			vo.setNo(rs.getInt(1));
			vo.setParent(rs.getInt(2));
			vo.setComment(rs.getInt(3));
			vo.setCate(rs.getString(4));
			vo.setTitle(rs.getString(5));
			vo.setContent(rs.getString(6));
			vo.setFile(rs.getInt(7));
			vo.setHit(rs.getInt(8));
			vo.setWriter(rs.getString(9));
			vo.setRegip(rs.getString(10));
			vo.setRdate(rs.getString(11));
			vo.setNick(rs.getString(12));
			
			
			list.add(vo);
			}
			close();
		}catch(Exception e){
			e.printStackTrace();
		}

		return list;
	}
	
	public int selectCountTotal() {
		int result = 0;
		conn = getConeecition();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(SQL.SELECT_ARPICLE_COUNT);
			
			if(rs.next()) {
				result = rs.getInt(1);
			}
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public List<ArticleVo> selectComments(String parent) {
		conn = getConeecition();
		List<ArticleVo> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(SQL.SELECT_COMMENTS);
			pst.setString(1, parent);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				ArticleVo vo = new ArticleVo();
				
				vo.setNo(rs.getInt(1));
				vo.setParent(rs.getInt(2));
				vo.setComment(rs.getInt(3));
				vo.setCate(rs.getString(4));
				vo.setTitle(rs.getString(5));
				vo.setContent(rs.getString(6));
				vo.setFile(rs.getInt(7));
				vo.setHit(rs.getInt(8));
				vo.setWriter(rs.getString(9));
				vo.setRegip(rs.getString(10));
				vo.setRdate(rs.getString(11));
				vo.setNick(rs.getString(12));
				
				
				list.add(vo);
			}
			
			close();
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void insertComment(ArticleVo vo) {
		
		try {
			conn = getConeecition();
			pst = conn.prepareStatement(SQL.INSERT_COMMENT);
			pst.setInt(1,vo.getParent());
			pst.setString(2,vo.getContent());
			pst.setString(3,vo.getWriter());
			pst.setString(4,vo.getRegip());
			
			pst.executeUpdate();
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void updateArticleForComment(String no) {
		conn = getConeecition();
		try {
			pst = conn.prepareStatement(SQL.UPDATE_ARTICLE_FOR_COMMENT);
			pst.setString(1, no);
			pst.executeUpdate();
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteComment(String no) {
		
		try {
			conn = getConeecition();
			pst = conn.prepareStatement(SQL.DELETE_COMMENT);
			pst.setString(1, no);
			pst.executeUpdate();
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteAticle(String no) {
			
		
	}
	
	public void updateAticle(ArticleVo vo) {}
	
	
}
