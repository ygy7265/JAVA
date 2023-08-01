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
	List<MemberVo> listvo = new ArrayList<>();
	MemberVo vo = null;
	try{
		
		Connection conn = DriverManager.getConnection(host,user,pass);
		PreparedStatement setpst = conn.prepareStatement("select * from `user4`");
		ResultSet rs = setpst.executeQuery();
		
		while(rs.next()){
			vo = new MemberVo();
			vo.setSeq(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setGender(rs.getInt(3));
			vo.setAge(rs.getInt(4));
			vo.setAddr(rs.getString(5));
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
				<th>number</th>
				<th>name</th>
				<th>gender</th>
				<th>age</th>
				<th>addr</th>
			</tr>
			
			<%for(MemberVo vo1 : listvo) {%>
				<tr>
					<th><%= vo1.getSeq() %></th>
					<th><%= vo1.getName() %></th>
					<th><%= vo1.getGender() %></th>
					<th><%= vo1.getAge() %></th>
					<th><%= vo1.getAddr() %></th>
				</tr>
			<%} %>
			
			
		</table>
		
			<a href="/Ch06/use4/register.jsp">add</a><br>
			<a href="/Ch06/1_JDBC.jsp">index</a>
	</body>
</html>