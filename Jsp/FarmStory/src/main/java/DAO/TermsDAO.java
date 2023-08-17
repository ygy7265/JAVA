package DAO;

import java.sql.SQLException;

import DB.DBHellper;
import DTO.TermsDTO;

public class TermsDAO extends DBHellper{
	public TermsDTO selectTerms() {
		TermsDTO dto = null;
		
		try {
			
			conn = getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM `terms`");
			if(rs.next()) {
				dto = new TermsDTO();
				dto.setTerms1(rs.getString(1));
				dto.setPrivacy(rs.getString(2));
			}
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dto;
		
		
	}
	
	 
}
