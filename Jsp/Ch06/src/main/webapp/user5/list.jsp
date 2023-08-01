<%@page import="vo.User5Vo"%>
<%@page import="vo.MemberVo"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.Connection"%>
<%@page import="vo.UserVo"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

	String host = "jdbc:mysql://127.0.0.1:3306/userdb";
	String user = "root";
	String pass = "root";
	List<User5Vo> listvo = new ArrayList<>();
	User5Vo vo = null;
	try{
		
		Connection conn = DriverManager.getConnection(host,user,pass);
		PreparedStatement setpst = conn.prepareStatement("select * from `user5`");
		ResultSet rs = setpst.executeQuery();
		
		while(rs.next()){
			vo = new User5Vo();
			vo.setId(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setBirth(rs.getString(3));
			vo.setAge(rs.getInt(4));
			vo.setAddress(rs.getString(5));
			vo.setHp(rs.getString(6));
			listvo.add(vo);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>list</title>
	</head>
	<body>
	<h3>user4 Add</h3>
		
		
		<table border="1">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>birth</th>
				<th>age</th>
				<th>addr</th>
				<th>hp</th>
			</tr>
			
			<%for(User5Vo vo1 : listvo) {%>
				<tr>
					<th><%= vo1.getId() %></th>
					<th><%= vo1.getName() %></th>
					<th><%= vo1.getBirth() %></th>
					<th><%= vo1.getAge() %></th>
					<th><%= vo1.getAddress() %></th>
					<th><%= vo1.getHp() %></th>
				</tr>
			<%} %>
			
			
		</table>
		
			<a href="/Ch06/use5/register.jsp">add</a><br>
			<a href="/Ch06/1_JDBC.jsp">index</a>
	</body>
</html>