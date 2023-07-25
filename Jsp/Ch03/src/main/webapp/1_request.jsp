<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>1_request</title>
	</head>
	<body>
		<h3>1.request libraryObject</h3>
		
		<h4>User add</h4>
		<form action="./proc/userProc.jsp" method = "get">
			<input type="text"name='uid'placeholder="id add"/><br>
			<input type="text"name='name'placeholder="name add"/><br>
			<input type="text"name='age'placeholder="age add"/><br>
			<input type="submit" value="submit"/><br>
		</form>
		
		<h4>Signin</h4>
		<form action="./proc/registerProc.jsp" method="post">
		
		
			<table border="1">
				<tr>
					<td>id</td>
					<td><input type="text" name="uid" placeholder="id add"> </td>
				
				</tr>
				<tr>
					<td>pass</td>
					<td><input type="text" name="pass" placeholder="pass add"> </td>
				
				</tr>
				<tr>
					<td>name</td>
					<td><input type="text" name="name" placeholder="name add"> </td>
				
				</tr>
				<tr>
					<td>birth</td>
					<td><input type="date" name="birth" placeholder="birth add"> </td>
				
				</tr>
				<tr>
				<td>gender</td>
					<td>
					
					<label><input type="radio" name="gender" value="1">man</label>
					<label><input type="radio" name="gender" value="2">woman</label>
					</td>
				</tr>
				
				<tr>
				<td>addr</td>
				<td>
					<select name = "addr">
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
					</select>
				</td>
				
				</tr>
				
				<tr>
				<td>취미</td>
				<td>
					<label><input type="checkbox" name="hobby" value="등산"/>등산하기</label>
					<label><input type="checkbox" name="hobby" value="독서"/>독서하기</label>
					<label><input type="checkbox" name="hobby" value="영화"/>영화보기</label>
					<label><input type="checkbox" name="hobby" value="운동"/>운동하기</label>
					<label><input type="checkbox" name="hobby" value="게임"/>게임하기</label>
				</td>
				
				</tr>
				<tr>
					<input type="submit" value="submit"/>
				</tr>
			</table>
		</form>

		<h4>Client Information</h4>
		<p>
			header  = <%=request.getHeader("User-Agent") %><br>
			Protocol  = <%=request.getProtocol()%><br>
			Servername  = <%=request.getServerName()%><br>
			requstAddr  = <%=request.getRequestURL() %><br>
			requestPath  = <%=request.getRequestURI()%><br>
			ipAddr  = <%=request.getRemoteAddr()%><br>
		</p>
	</body>
</html>