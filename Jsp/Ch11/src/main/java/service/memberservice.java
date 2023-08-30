package service;

import java.util.List;

import dao.memberDAO;
import dto.memberDTO;

public enum memberservice {
	
	INSTANCE;
	private memberDAO dao = memberDAO.getInstance();
	
	
	public List<memberDTO> selects(){
		return dao.selectMembers();
	}
	public void insert(memberDTO dto) {
		dao.insertMember(dto);
	}
}
