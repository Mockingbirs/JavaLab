<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.sql.*" %>
    
<%
//JSP로 DB연결 방법 2/4

//1. sql package import
//2. jdbc driver loading
//		src -> webapp -> WEB-INF -> lib 이 위치에 드라이버 파일 넣기
//

String driverClass = "com.mysql.jdbc.Driver";
Class.forName(driverClass);

//3. Connection Object
Connection conn = null;

String url = "jdbc:mysql://localhost:3306/exam";
String id = "root";
String pw = "0000";

conn = DriverManager.getConnection(url, id, pw);


//4. Statement Object
PreparedStatement pstmt = null;  //구문객체 초기화

%>
