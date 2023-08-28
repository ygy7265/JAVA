package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import db.SQL;
import dto.ArticleDTO;

public class ArticleDAO extends DBHelper{
	public void insertAticle(ArticleDTO dto) {

		try {
			conn = getConeecition();
			pst= conn.prepareStatement(SQL.INSERT_WRITER);
			pst.setString(1, dto.getTitle());
			pst.setString(2, dto.getContent());
			pst.setString(3, dto.getWriter());
			pst.setString(4, dto.getRegip());
			pst.executeUpdate();
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public ArticleDTO selectAticle(String no) {
		conn = getConeecition();
		ArticleDTO vo = new ArticleDTO();
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
	
	public List<ArticleDTO> selectAticles(int start) {
		List<ArticleDTO> list = new ArrayList<>();
		try{
			conn = getConeecition();
			pst = conn.prepareStatement(SQL.SELECT_ARTICLES);
			pst.setInt(1, start);
			rs = pst.executeQuery();
			
			while(rs.next()) {
			 ArticleDTO dto = new ArticleDTO();
			
			 dto.setNo(rs.getInt(1));
			 dto.setParent(rs.getInt(2));
			 dto.setComment(rs.getInt(3));
			 dto.setCate(rs.getString(4));
			 dto.setTitle(rs.getString(5));
			 dto.setContent(rs.getString(6));
			 dto.setFile(rs.getInt(7));
			 dto.setHit(rs.getInt(8));
			 dto.setWriter(rs.getString(9));
			 dto.setRegip(rs.getString(10));
			 dto.setRdate(rs.getString(11));
			 dto.setNick(rs.getString(12));
			
			
			list.add(dto);
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
	
	public List<ArticleDTO> selectComments(String parent) {
		conn = getConeecition();
		List<ArticleDTO> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(SQL.SELECT_COMMENTS);
			pst.setString(1, parent);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				ArticleDTO vo = new ArticleDTO();
				
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
	
	public void insertComment(ArticleDTO dto) {
		
		try {
			conn = getConeecition();
			pst = conn.prepareStatement(SQL.INSERT_COMMENT);
			pst.setInt(1,dto.getParent());
			pst.setString(2,dto.getContent());
			pst.setString(3,dto.getWriter());
			pst.setString(4,dto.getRegip());
			
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
	
	public void updateAticle(ArticleDTO dto) {}
	
}
