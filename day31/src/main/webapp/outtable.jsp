<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
       <%@ page import="java.sql.*" %>
    

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
  <% 
	
 
 	
    String driverClass = "com.mysql.jdbc.Driver";
    Class.forName(driverClass);
    

    Connection conn = null;  //접속
    
    String url = "jdbc:mysql://localhost:3306/exam";
    String id = "root";
    String pw = "0000";
    
    conn = DriverManager.getConnection(url, id, pw);
    
   
    PreparedStatement pstmt = null; //구문
    

    String sql = "SELECT * FROM exam";
    
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
      <th scope="col">학번</th>
      <th scope="col">이름</th>
      <th scope="col">학년</th>
      <th scope="col">전공</th>
      <th scope="col">주소</th>
    </tr>
  </thead>
  
  <%
  int i=1;
  
  while(rset.next()){
	  String hakbun = rset.getString("hakbun");
	  String name = rset.getString("name");
	  String year = rset.getString("year");
	  String dept = rset.getString("dept");
	  String addr = rset.getString("addr");

 
  
  %>
  <tbody>
    <tr>
      <th scope="row"><%=i %></th>
      <td ><%=hakbun%></td>
      <td><%=name%></td>
      <td><%=year%></td>
      <td><%=dept%></td>
      <td><%=addr%></td>
    </tr>
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