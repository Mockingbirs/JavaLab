<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

    <% 
    //JSP로 DB연결 방법 1/4
    
    //1. sql package import
    //2. jdbc driver loading
    //		src -> webapp -> WEB-INF -> lib 이 위치에 드라이버 파일 넣기
    //
    
    String driverClass = "com.mysql.jdbc.Driver";
    Class.forName(driverClass);
    
    //3. Connection Object
    Connection conn = null;
    
    String url = "jdbc:mysql://localhost:3306/";
    String id = "root";
    String pw = "0000";
    
    conn = DriverManager.getConnection(url, id, pw);
    
   
    //4. Statement Object
    PreparedStatement pstmt = null;  //구문객체 초기화
    
    String sql = "CREATE DATABASE exam";
    pstmt = conn.prepareStatement(sql);
    
    //5. SQL Execute
    
    pstmt.executeUpdate();
    
    //6. ResultSet Object
    		//미실시(sql 실행 결과 수신)
    		
 		
 	//7. Connection Close  8버전까지는 필수, 그이후부터는 선택
 	pstmt.close();
    conn.close();
    %>
    
   
    