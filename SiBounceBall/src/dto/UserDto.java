package dto;

public class UserDto {

	String id; //pk
	String nickname;
	int L1;
	int L2;
	int L3;
	int L4;
	int L5;
	int L6;
	int L7;
	int L8;
	int L9;
	
	public UserDto() {}
	
	public UserDto(String id, String nickname, int L1, int L2, int L3, int L4, int L5, int L6, int L7, int L8, int L9) {
		this.id = id;
		this.nickname = nickname;
		this.L1 = L1;
		this.L2 = L2;
		this.L3 = L3;
		this.L4 = L4;
		this.L5 = L5;
		this.L6 = L6;
		this.L7 = L7;
		this.L8 = L8;
		this.L9 = L9;

	}
	
	// getter
	public String getId() {
		return id;
	}

	public String getNickname() {
		return nickname;
	}

	public int getL1() {
		return L1;
	}

	public int getL2() {
		return L2;
	}

	public int getL3() {
		return L3;
	}

	public int getL4() {
		return L4;
	}

	public int getL5() {
		return L5;
	}

	public int getL6() {
		return L6;
	}

	public int getL7() {
		return L7;
	}

	public int getL8() {
		return L8;
	}

	public int getL9() {
		return L9;
	}

	
	// setter
	public void setId(String id) {
		this.id = id;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setL1(int l1) {
		L1 = l1;
	}

	public void setL2(int l2) {
		L2 = l2;
	}

	public void setL3(int l3) {
		L3 = l3;
	}

	public void setL4(int l4) {
		L4 = l4;
	}

	public void setL5(int l5) {
		L5 = l5;
	}

	public void setL6(int l6) {
		L6 = l6;
	}

	public void setL7(int l7) {
		L7 = l7;
	}

	public void setL8(int l8) {
		L8 = l8;
	}

	public void setL9(int l9) {
		L9 = l9;
	}
	
	
	
}
