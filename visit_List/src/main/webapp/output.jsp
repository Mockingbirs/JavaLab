<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
       <%@ page import="java.sql.*" %>
       <%@ include file="db.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
  <% 
	
 
 	

    

    String sql = "SELECT * FROM visit";
    
    pstmt = conn.prepareStatement(sql);
    
    ResultSet rset = null; //결과
    
    rset = pstmt.executeQuery();
    
    %>
    

    <div class="container text-center">
    <div class="alert alert-primary"  role="alert" >
 회원 정보 조회
</div>
   
    <div class="container">
    <table class="table table-hover">
<thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">메모</th>
     
    </tr>
  </thead>
  
  <%
  int i=1;
  
  while(rset.next()){
	  String memo = rset.getString("memo");
	

 
  
  %>
  <tbody>
    <tr>
      <th scope="row"><%=i %></th>
      <td ><%=memo%></td>

<%  
i++;	}
  %>
  </tbody>
</table>

</div>

    <%
    rset.close();
    pstmt.close();
    conn.close();
    
    %>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>