package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import DB.DBHellper;
import DB.SQL;
import DTO.ArticleDTO;

public class ArticleDAO extends DBHellper{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public void InsertArticle(ArticleDTO dto) {
		conn = getConnection();
		try {
			logger.info("insert Article Start..");
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
			logger.error("insert Article error = " + e.getMessage());
		}
		
	}

	public List<ArticleDTO> SelectArticle(String cate, int start) {
		conn = getConnection();
		List<ArticleDTO> list = new ArrayList<>();
		
		try {
			logger.info("Selects Article Start..");
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
			logger.error("Select Article List error = " + e.getMessage());
		}
		
		return list;
	}

	public int PageArticle(String cate) {
		conn = getConnection();
		int result = 0;
		try {
			logger.info("Page Article Start..");
			pst = conn.prepareStatement(SQL.SELECT_ARTICLE_PAGE);
			pst.setString(1, cate);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt(1);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("Page Article error = " + e.getMessage());
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
			logger.error("Page View Article error = " + e.getMessage());
		}
		
		return dto;
	}
	
	public List<ArticleDTO> SelectArticleComment(String parent) {
		conn = getConnection();
		List<ArticleDTO> list = new ArrayList<>();
		
		try {
			logger.info("Select Comment Start..");
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
			logger.error("Select Article Comment error = " + e.getMessage());
		}
		
		return list;
	}

	public void InsertArticleComment(ArticleDTO dto) {
		conn = getConnection();
		try {
			logger.info("Insert Article Comment Start..");
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
			logger.error("Insert Article Comment error = " + e.getMessage());
		}
	}
	
	public int ViewCount(int parent) {
		conn = getConnection();
		int result = 0;
		try {
			logger.info("View Count Start..");
			pst = conn.prepareStatement(SQL.SELECT_ARTICLE_VIEW_COUNT);
			pst.setInt(1, parent);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt(1);
			}
			close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("Count Article Comment error = " + e.getMessage());
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
			logger.error("Delete Article Comment error = " + e.getMessage());
		}
		
	}
	
	public void DeleteView(String no) {
		conn = getConnection();
		try {
			logger.info("Delete View Start..");
			pst = conn.prepareStatement(SQL.DELETE_ARTICLE_VIEW);
			pst.setString(1, no);
			pst.setString(2, no);
			pst.executeUpdate();
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("DeleteView error = " + e.getMessage());
		}
		
	}

}
