<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:useBean id="ub" class="sub1.UserBean"></jsp:useBean>
	<jsp:setProperty property="uid" name = "ub"/>
	<jsp:setProperty property="name" name = "ub"/>
	<jsp:setProperty property="hp" name = "ub"/>
	<jsp:setProperty property="age" name = "ub"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>userproc</title>
	</head>
	<body>
		<h3>submit data console</h3>
		<p>
			id = <%= ub.getUid() %>
			name = <%= ub.getName() %>
			hp = <%= ub.getHp() %>
			age = <%= ub.getAge() %>
			
		</p>
	</body>
</html>