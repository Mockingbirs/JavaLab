<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



    <%@ page import="java.sql.*" %>
    
    <%@ include file = "profdb.jsp" %>
    
    <% 
    String sql = "CREATE TABLE prof("
    +"pno varchar(20),"
    +" pname varchar(20), "
    +" pdepart varchar(50),"
    +" pmoblie varchar(20))";
    
    pstmt = conn.prepareStatement(sql);
    
    pstmt.executeUpdate();
   
    
    pstmt.close();
    conn.close();
    
    %>