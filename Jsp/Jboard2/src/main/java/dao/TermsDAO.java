package dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import db.DBHelper;
import db.SQL;
import dto.TermsDTO;

public class TermsDAO extends DBHelper{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public void insertTerms() {
		
	}
	
	public TermsDTO selectTerms() {
		TermsDTO dto = new TermsDTO();
		try {
			conn = getConeecition();
			st = conn.createStatement();
			rs = st.executeQuery(SQL.SELECT_TERMS);
			
			if(rs.next()) {
				dto.setTerms(rs.getString(1));
				dto.setPrivacy(rs.getString(2));
			}
		close();
		}catch(Exception e) {
			logger.error("selectTerms error = " + e.getMessage());
		}
		return dto;
	}
	
	public void updateTerms() {
		
	}
	
	public void deleteTerms() {
		
	}
}
