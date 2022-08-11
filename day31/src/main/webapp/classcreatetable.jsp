<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<%@ page import="day31.*" %>

    <%
    //JSP로 DB 연결 방법 3/4
 	Connection conn =null;
    conn = DbConnClose.getConnection();
    
    //4. Statement Object
    PreparedStatement pstmt = null;  //구문객체 초기화
    
    String sql = "CREATE TABLE exam3("
			+ "hakbun	int 	not null,"
			+ "name		char(5),"
			+ "year 	int,"
			+ "dept		varchar(10),"
			+ "addr		varchar(50),"
			+ "primary key(hakbun))";
    pstmt = conn.prepareStatement(sql);
    
    //5. SQL Execute
    
    pstmt.executeUpdate();
    
    //6. ResultSet Object
    		//미실시(sql 실행 결과 수신)
    		
 		
 	//7. Connection Close  8버전까지는 필수, 그이후부터는 선택
 	pstmt.close();
    conn.close();
    %>
    
   
    