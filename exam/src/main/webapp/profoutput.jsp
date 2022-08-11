<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page import="java.sql.*"%>
    
    <%@ page import="exam.*"%>
    
    <% 
    Connection conn = null;
    conn=classoutput.getConnection();
    
    
    String sql = "SELECT * FROM prof";
    
    PreparedStatement pstmt = null;
    
    pstmt = conn.prepareStatement(sql);
  
  ResultSet rset = null; 
    
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
      <th scope="col">교수번호</th>
      <th scope="col">교수명</th>
      <th scope="col">학과</th>
      <th scope="col">전번</th>
  
    </tr>
  </thead>
  
  <%
  int i=1;
  
  while(rset.next()){
	  String pno = rset.getString("pno");
	  String pname = rset.getString("pname");
	  String pdepart = rset.getString("pdepart");
	  String pmobile = rset.getString("pmobile");


 
  
  %>
  <tbody>
    <tr>
      <th scope="row"><%=i %></th>
      <td ><%=pno%></td>
      <td><%=pname%></td>
      <td><%=pdepart%></td>
      <td><%=pmobile%></td>
  
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