package visit_List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class visit {
	public static Connection getConnection(){
		
		String driverClass = "com.mysql.jdbc.Driver";
		try {
		Class.forName(driverClass);
		} catch(ClassNotFoundException e) {
			System.out.println("Err.1");
		}
		Connection conn = null;
		
		String url = "jdbc:mysql://localhost:3306/exam";
		String id = "root";
		String pw = "0000";
		
		
		try {
		conn=DriverManager.getConnection(url, id, pw);
		} catch(SQLException e) {System.out.println("Err.2");
			
		}
		
		PreparedStatement pstmt = null;
		
		return conn;
	}

}
