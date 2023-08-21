package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB.DBHellper;
import DB.SQL;
import DTO.ArticleDTO;

public class ArticleDAO extends DBHellper{
	public void InsertArticle(ArticleDTO dto) {
		conn = getConnection();
		try {
			pst = conn.prepareStatement(SQL.INSERT_ARTICLE);
			pst.setString(1, dto.getCate());
			pst.setString(2, dto.getTitle());
			pst.setString(3, dto.getContent());
			pst.setString(4, dto.getWriter());
			pst.setString(5, dto.getRegip());

			
			pst.executeUpdate();
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<ArticleDTO> SelectArticle(String cate, int start) {
		conn = getConnection();
		List<ArticleDTO> list = new ArrayList<>();
		
		try {
			ArticleDTO dto = null;
			pst = conn.prepareStatement(SQL.SELECT_ARTICLE);
			pst.setString(1, cate);
			pst.setInt(2, start);
			rs = pst.executeQuery();
			while(rs.next()) {
				dto = new ArticleDTO();
				dto.setNo(rs.getInt(1));
				dto.setParent(rs.getString(2));
				dto.setComment(rs.getInt(3));
				dto.setCate(rs.getString(4));
				dto.setTitle(rs.getString(5));
				dto.setContent(rs.getString(6));
				dto.setFile(rs.getInt(7));
				dto.setHit(rs.getInt(8));
				dto.setWriter(rs.getString(9));
				dto.setRegip(rs.getString(10));
				dto.setRdate(rs.getString(11));
				list.add(dto);
			}
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public int PageArticle(String cate) {
		conn = getConnection();
		int result = 0;
		try {
			pst = conn.prepareStatement(SQL.SELECT_ARTICLE_PAGE);
			pst.setString(1, cate);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt(1);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public ArticleDTO viewPage(String no) {
		conn = getConnection();
		ArticleDTO dto = null;
		try {
			pst = conn.prepareStatement(SQL.SELECT_ARTICLE_VIEW_PAGE);
			pst.setString(1, no);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				dto = new ArticleDTO();
				dto.setNo(rs.getInt(1));
				dto.setParent(rs.getString(2));
				dto.setComment(rs.getInt(3));
				dto.setCate(rs.getString(4));
				dto.setTitle(rs.getString(5));
				dto.setContent(rs.getString(6));
				dto.setFile(rs.getInt(7));
				dto.setHit(rs.getInt(8));
				dto.setWriter(rs.getString(9));
				dto.setRegip(rs.getString(10));
				dto.setRdate(rs.getString(11));
			}
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dto;
	}
	
	public List<ArticleDTO> SelectArticleComment(String parent) {
		conn = getConnection();
		List<ArticleDTO> list = new ArrayList<>();
		
		try {
			ArticleDTO dto = null;
			pst = conn.prepareStatement(SQL.SELECT_ARTICLE_COMMENT);
			pst.setString(1, parent);
			rs = pst.executeQuery();
			while(rs.next()) {
				dto = new ArticleDTO();
				dto.setNo(rs.getInt(1));
				dto.setParent(rs.getString(2));
				dto.setComment(rs.getInt(3));
				dto.setCate(rs.getString(4));
				dto.setTitle(rs.getString(5));
				dto.setContent(rs.getString(6));
				dto.setFile(rs.getInt(7));
				dto.setHit(rs.getInt(8));
				dto.setWriter(rs.getString(9));
				dto.setRegip(rs.getString(10));
				dto.setRdate(rs.getString(11));
				list.add(dto);
			}
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public void InsertArticleComment(ArticleDTO dto) {
		conn = getConnection();
		try {
			pst = conn.prepareStatement(SQL.INSERT_ARTICLE_COMMENT);
			pst.setString(1, dto.getCate());
			pst.setString(2, dto.getParent());
			pst.setString(3, dto.getContent());
			pst.setString(4, dto.getWriter());
			pst.setString(5, dto.getRegip());

			
			pst.executeUpdate();
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int ViewCount(int parent) {
		conn = getConnection();
		int result = 0;
		try {
			pst = conn.prepareStatement(SQL.SELECT_ARTICLE_VIEW_COUNT);
			pst.setInt(1, parent);
			rs = pst.executeQuery();
			
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

	public void DeleteComment(String no) {
		conn = getConnection();
		try {
			pst = conn.prepareStatement(SQL.DELETE_ARTICLE_COMMENT);
			pst.setString(1, no);
			pst.executeUpdate();
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void DeleteView(String no) {
		conn = getConnection();
		try {
			pst = conn.prepareStatement(SQL.DELETE_ARTICLE_VIEW);
			pst.setString(1, no);
			pst.setString(2, no);
			pst.executeUpdate();
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
