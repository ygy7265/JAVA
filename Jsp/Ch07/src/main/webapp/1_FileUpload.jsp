<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>1_FileUpload</title>
	</head>
	<body>
		<h3>1.FileUpload Practice</h3>
		
		<form action="./upload/fileupload.jsp" method="post" enctype = "multipart/form-data">
			<input type = "file" name = "file"><br>
		<input type = "submit">
		</form>
	</body>
</html>