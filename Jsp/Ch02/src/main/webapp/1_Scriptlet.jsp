<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>1_Scriptlet</title>
	</head>
	<body>
		<h3>1.Scriptlet</h3>
		
		<h4>Scriptlet</h4> 
		<%
			int var1 = 1;
			boolean var2 = true;
			double var3 = 3.14;
			String var4 = "Hello";
			
			out.println("<p> var1 = " +var1 +  "</p>");
			out.println("<p> var1 = " +var2 +  "</p>");
			out.println("<p> var1 = " +var3 +  "</p>");
			out.println("<p> var1 = " +var4 +  "</p>");
		
		%>
		<h4>Expresstion</h4>
		<p>var3 = <%= var3 %> </p>
	</body>
</html>