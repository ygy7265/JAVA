<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		
		<title>not found page</title>
	</head>
	<body>

		<h3>request page not found. re check</h3>
		<p>
			error type=  <%= exception.getClass().getName() %>
		</p>
		<a href="../6_exception.jsp"></a>
	</body>
</html>