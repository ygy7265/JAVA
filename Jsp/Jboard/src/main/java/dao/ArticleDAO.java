package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import db.SQL;
import vo.ArticleVo;

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
	
	public ArticleVo selectAticle(int no) {
		
		return null;
	}
	
	public List<ArticleVo> selectAticles() {
		List<ArticleVo> list = new ArrayList<>();
		try{
			conn = getConeecition();
			pst = conn.prepareStatement(SQL.SELECT_ARTICLES);
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
			
			
			list.add(vo);
			}
			close();
		}catch(Exception e){
			e.printStackTrace();
		}

		return list;
	}
	
	public void deleteAticle(int no) {}
	
	public void updateAticle(ArticleVo vo) {}
	
	
}
