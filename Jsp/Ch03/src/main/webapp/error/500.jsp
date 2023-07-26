<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		
		<title>server error</title>
	</head>
	<body>

		<h3>server problem re check</h3>
		<p>
			error type=  <%= exception.getClass().getName() %>
			error content = <%=exception.getMessage() %>
		</p>
		<a href="../6_exception.jsp"></a>
	</body>
</html>