<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>2_Condition</title>
	</head>
	<body>
		<h3>2.Condition</h3>
		
		<h4>if</h4>
		<%
			int num1 = 1;
			int num2 = 2;
			int num3 = 3;
			int num4 = 4;
			
			if(num1 > 0 ){
				out.print("<p>num1 > 0 </p>");
			}
		%>
		<h4>if ~ else</h4>
		<%
			int var1 = 1 , var2 = 2;
			
			if(var1 > var2){	
		%>
			<p>var1 > var2</p>
		<%	
			}
			else{
		%>
			<p>var1 < var2</p>
		<%
			}
		%>
		<h4>if ~ else if ~ else</h4>
		
		<% int n1=1, n2=2, n3=3, n4=4; %>
		<% if(n1 > n2){ %>
			<p>n1 > n2</p>
		<% }else if(n2 > n3){ %>
			<p>n2 > n3</p>
		<% }else if(n3 > n4){ %>
			<p>n3 > n4</p>
		<% }else { %>
			<p>n4 biggest</p>
		<% } %>
	</body>
</html>