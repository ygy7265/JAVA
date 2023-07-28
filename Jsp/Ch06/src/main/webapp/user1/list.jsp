<%@page import="vo.UserVo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!-- 
	Date : 2023/07/28
	name : Yoongyeongyeop
	content : JDBC
 -->
<%
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "root";
		List<UserVo> users = new ArrayList<>();
	try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(host,user,pass);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from `user1`");
		
		while(rs.next()){
			UserVo vo = new UserVo();
			vo.setUid(rs.getString(1));
			vo.setName(rs.getString(2));
			vo.setHp(rs.getString(3));
			vo.setAge(rs.getInt(4));
			
			users.add(vo);
		}
		rs.close();
		conn.close();
		st.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>user1 list</h3>
		<a href="/Ch06/user1/register.jsp">user1 add</a>
		
		<table border="1">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>hp</th>
				<th>age</th>
				<th>mag</th>
			</tr>
			<% for(UserVo vo : users){ %>
			<tr>
				<td><%= vo.getUid() %></td>
				<td><%= vo.getName() %></td>
				<td><%= vo.getHp() %></td>
				<td><%= vo.getAge() %></td>
				<td>
					<a href="/Ch06/user1/modify.jsp?uid=<%= vo.getUid()%>">update</a>
					<a href="/Ch06/user1/delete.jsp?uid=<%= vo.getUid()%>">delete</a>
				</td>
			</tr>
			<%} %>
		</table>
	</body>
</html>