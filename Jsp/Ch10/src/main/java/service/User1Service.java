package service;

import java.util.List;

import dao.User1DAO;
import dto.User1DTO;

public class User1Service {
	private User1DAO dao = new User1DAO();
	
	public void insertUser1(User1DTO dto) {
		dao.insertUser1(dto);
	}
	public User1DTO selectUser1(String uid) {
		return dao.selectUser1(uid);
	}
	public List<User1DTO> selectUser1s() {
		return dao.selectUser1s();
	}
	public void updateUser1(User1DTO dto) {
		dao.updateUser1(dto);
	}
	public void deleteUser1(String uid) {
		dao.deleteUser1(uid);
	}
}
