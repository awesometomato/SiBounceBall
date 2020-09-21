package dto;

public class JoinDto {

	String id;
	String nickname;
	String pw;
	
	public JoinDto() {}
	
	public JoinDto(String id, String nickname, String pw){
		this.id = id;
		this.nickname = nickname;
		this.pw = pw;
	}

	//getter
	public String getId() {
		return id;
	}

	public String getNickname() {
		return nickname;
	}

	public String getPw() {
		return pw;
	}

	//setter
	public void setId(String id) {
		this.id = id;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
