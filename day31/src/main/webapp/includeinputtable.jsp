<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<%@ include file="includedb.jsp" %>
    <% 
	
    String hakbun = "20212234";
 	String name = "kim";
 	String year = "3";
 	String dept = "db";
 	String addr = "Seoul saejel";
 	

    String sql = "INSERT INTO exam1 VALUES(?,?,?,?,?)";
    
    pstmt = conn.prepareStatement(sql);
    	pstmt.setString(1, hakbun);
    	pstmt.setString(2, name);
    	pstmt.setString(3, year);
    	pstmt.setString(4, dept);
    	pstmt.setString(5, addr);    	
    
        pstmt.executeUpdate();
        
        //6. ResultSet Object
        		//미실시(sql 실행 결과 수신)
        		
     		
     	//7. Connection Close  8버전까지는 필수, 그이후부터는 선택
     	pstmt.close();
        conn.close();
        %>

