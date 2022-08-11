<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page import="java.sql.*"%>
    
    <%@ include file = "profdb.jsp" %>
    
    
    <% 
    String pno = "54321";
    String name = "park";
    String pdepart = "db";
    String pmobile = "01011112222";
    
    String sql = "INSERT INTO prof VALUES(?, ?, ?, ?)";
    
    pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, pno);
    pstmt.setString(2, name);
    pstmt.setString(3, pdepart);
    pstmt.setString(4, pmobile);
    
    pstmt.executeUpdate();
    
    pstmt.close();
    conn.close();
    
    
    
    
    %>
    