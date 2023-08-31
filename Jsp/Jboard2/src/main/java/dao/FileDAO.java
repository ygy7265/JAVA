package dao;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import db.DBHelper;
import db.SQL;
import dto.ArticleDTO;
import dto.FileDTO;

public class FileDAO extends DBHelper{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public FileDTO selectFile(int fno) {
		return null;
	}
	public FileDTO selectFileName(int ano) {
		conn = getConeecition();
		FileDTO dto = null;
		try {
			pst = conn.prepareStatement(SQL.SELECT_FILE_NAME_NO );
			pst.setInt(1,ano);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				dto = new FileDTO();						
				dto.setFno(rs.getInt(1));
				dto.setAno(rs.getInt(2));
				dto.setOfile(rs.getString(3));
				dto.setSfile(rs.getString(4));
				dto.setDownload(rs.getInt(5));
				dto.setRdate(rs.getString(6));
			}
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	public List<FileDTO> selectFiles() {
		return null;
	}
	public void insertFile(FileDTO dto) {
		conn = getConeecition();
		try {
			st = conn.createStatement();
			pst = conn.prepareStatement(SQL.INSERT_FILE);
			
			pst.setInt(1, dto.getAno());
			pst.setString(2, dto.getOfile());
			pst.setString(3, dto.getSfile());
			
			pst.executeUpdate();
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void updateFile(int fno) {
		
	}
	public void deleteFile(int fno) {
		
	}
}
