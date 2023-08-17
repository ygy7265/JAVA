package DAO;

import java.sql.SQLException;

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
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
