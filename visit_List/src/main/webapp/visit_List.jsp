<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



    <%@ page import="java.sql.*" %>
    
    <%@ page import= "visit_List.*" %>
    
    <% 
    String sql = "CREATE TABLE visit2("
    +"memo varchar(50))";
    
    Connection conn = null;
    conn=visit.getConnection();
    
    PreparedStatement pstmt = null;
    pstmt = conn.prepareStatement(sql);
    
    pstmt.executeUpdate();
   
    
    pstmt.close();
    conn.close();
    
    %>