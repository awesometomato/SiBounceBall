package service;

import dao.UDao;
import dto.JoinDto;
import dto.LoginDto;
import dto.UserDto;

public class UserService {

	public int join(JoinDto dto) {
		UDao dao = new UDao();
		return dao.join(dto); // 1: 회원가입 성공   |  0 : 중복된 아이디 존재  	
	}
	
	public int login(LoginDto dto) {
		UDao dao = new UDao();
		return dao.login(dto); // 1 : 로그인 성공   |  0 : pw가 틀림   |  -1 : id 존재하지 않음
	}
	
	public UserDto getUserInfo(String id) { 
		UDao dao = new UDao();
		return dao.userInfo(id);
	}
	
	public int isClearedLevel(String id, int level) { // 1 : cleared  |  0 : uncleared
		String slevel = "L"+level;
		UDao dao = new UDao();
		return dao.isClearedLevel(id, slevel);
	}
	
	public void updateLevelStatus(String id, int level) { // 1 : cleared  | 0 : uncleared 
		String slevel = "L"+level;
		UDao dao = new UDao();
		dao.updateUserLevelInfo(id, slevel);
	}
	
}
