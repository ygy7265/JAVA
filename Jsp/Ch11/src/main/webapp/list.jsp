<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
	 <h3>list</h3>
	 <table border="1">
	 	<tr>
	 		<td>ID</td>
	 		<td>NAME</td>
	 		<td>HP</td>
	 		<td>POS</td>
	 		<td>DEP</td>
	 		<td>DATE</td>
	 	</tr>
	 	<tr>
	 	
	 		 
	 	
	 	<c:forEach var="member" items="${requestScope.members}">
	 		<tr>
	 			<td>${member.getUid() }</td>
	 			<td>${member.getName() }</td>
	 			<td>${member.getHp() }</td>
	 			<td>${member.getPos() }</td>
	 			<td>${member.getDep() }</td>
	 			<td>${member.getDate() }</td>
	 		</tr>
	 	</c:forEach>
	 	</tr>
	 </table>
	</body>
</html>