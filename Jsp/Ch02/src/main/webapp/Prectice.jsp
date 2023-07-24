<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<%
	String name = "aaa";
	String num2 = "111";
	String num4 = "111";
	int num1 = 333;
	int num3 = 444;
	int napar = Integer.parseInt(num2);
	int napar2 = Integer.parseInt(num4);
	
	out.println("<p> num1 =" + num1 + "</p>");
	out.println("<p> name =" + name + "</p>");
	out.println("<p> num1 + name =" + name + num1 + "</p>");
	out.println("<p> num1 + num2 =" + num1 + num2 + "</p>");
	out.println("<p> num1 + num2 =" + (num1 + num3) + "</p>");
	out.write("<p> num1 + num2 =" + num1 + num3 + "</p>");
	out.write("<p> napar =" + napar + "</p>");
	out.write("<p> napar =" + (napar+napar2) + "</p>");
	
	%>
	</body>
</html>