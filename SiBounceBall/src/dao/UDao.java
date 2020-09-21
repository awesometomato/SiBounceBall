package dao;

import java.sql.Connection;
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
	
	public UDto userInfo() {
		
		UDto dto = null;
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
		
		return null;
	}
}
