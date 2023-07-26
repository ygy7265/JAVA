<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 
	Date : 2023/07/26
	name : Yoongyeongyeop
	content : forward actionTag
 -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>2_includeTag</title>
	</head>
	<body>
		<h3>2.include actionTag</h3>
		
		<h4>include indicator</h4>
		<%@ include file="./inc/_header.html" %>
		<%@ include file="./inc/_footer.html" %>
		<%@ include file="./inc/_config1.jsp" %>
		
		<p>
			num1 = <%= num1 %><br>
			num2 = <%= num2 %><br>
			num3 = <%= num3 %><br>
		</p>
		
		<h4>include Tag</h4>
		<jsp:include page="./inc/_header.html"></jsp:include>
		<jsp:include page="./inc/_footer.html"></jsp:include>
		<jsp:include page="./inc/_config2.jsp"></jsp:include>
		<%--
		<p>
		    var1 = <%= var1 %><br>
			var2 = <%= var2 %><br>
			var3 = <%= var3 %><br> 
		</p>
		 --%>
		
		<h4>include method</h4>
		
		<%
			pageContext.include("./inc/_header.html");
			pageContext.include("./inc/_footer.html");
		%>
	</body>
</html>