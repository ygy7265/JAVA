<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>3.EmailTest</h3>
		
		<form action="./proc/sendEmail.jsp">
			<table border="1">
				<tr>
					<td>보내는사람</td>
					<td><input type ="text" name="sender"></td>
				</tr>
				<tr>
					<td>받는사람</td>
					<td><input type ="text" name="receiver"></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type ="text" name="title"></td>
				</tr>
				<tr>
					<td>내용</td>
					<td>
						<textarea rows="20" cols="60" name="content"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="submit"></td>
				</tr>
			</table>
		</form>
	</body>
</html>