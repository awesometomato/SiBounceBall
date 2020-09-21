package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.UDto;

public class UDao {

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public UDao() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver load success!");
			
		} catch (Exception e) {
			System.out.println("errer in UDao() : ");
			e.printStackTrace();
		}
		
	}
	
	
	public int join(UDto dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			
		} catch(Exception e1) {
			System.out.println("errer in userInfo() - e1 : ");
			e1.printStackTrace();
		} finally {
			try {
				
			} catch(Exception e2) { System.out.println("errer in userInfo() - e1 : "); e2.printStackTrace(); }
		}
		
		return 1;
	}
	
	public int login(String id) { return 1;}
	
	public UDto userInfo(String uId) {
		
		UDto dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB conn success!");
			
			String query = "select * from users where id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, uId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("id");
				String nickname = rs.getString("nickname");
				int L1 = rs.getInt("L1");
				int L2 = rs.getInt("L2");
				int L3 = rs.getInt("L3");
				int L4 = rs.getInt("L4");
				int L5 = rs.getInt("L5");
				int L6 = rs.getInt("L6");
				int L7 = rs.getInt("L7");
				int L8 = rs.getInt("L8");
				int L9 = rs.getInt("L9");
				
				dto = new UDto(id, nickname, L1, L2, L3, L4, L5, L6, L7, L8, L9);
			}
			
		} catch(Exception e1) {
			System.out.println("errer in userInfo() - e1 : ");
			e1.printStackTrace();
		} finally {
			try {
				
			} catch(Exception e2) { System.out.println("errer in userInfo() - e1 : "); e2.printStackTrace(); }
		}
		
		return dto;
	}
	
	public UDto updateUserLevelInfo(String id) { return null; }
	
}
