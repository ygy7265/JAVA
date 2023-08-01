<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user6:register</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$('input[type=submit]').click(function(e){
					e.preventDefault();
					
					//add data get
					const uid = $('input[name = id]').val();
					const name = $('input[name = name]').val();
					const hp = $('input[name = hp]').val();
					const age = $('input[name = age]').val();
					
					//json create
					
					const jsonData = {
							"uid":uid,
							"name":name,
							"hp":hp,
							"age":age
					};
					console.log(jsonData);
					
					$.ajax({
						url:'./useradd.jsp',
						type:'GET',
						data: jsonData,
						dataType:'json',
						success: function(data){
							console.log(data);
							
							if(data.result >= 1){
								alert("data Add success");
								
								$('form')[0].reset();
							}else{
								alert("Failed.. Check rule");
							}
						}
					});
				});
			});
		</script>
	</head>
	<body>
		<h3>User6 ADD</h3>
		<a href="/Ch06/1_JDBC.jsp">index</a>
		<a href="/Ch06/user6/list.jsp">user6 list</a>
		<form action="#" method="post">
			<table border="1">
				<tr>
					<th>id = </th>
					<th><input type="text" name="id" placeholder="id add"></th>
				</tr>
				
				<tr>
					<th>name = </th>
					<th><input type="text" name="name" placeholder="name add"></th>
				</tr>
				<tr>
					<th>hp = </th>
					<th><input type="text" name="hp" placeholder="hp add"></th>
				</tr>
				<tr>
					<th>age = </th>
					<th><input type="text" name="age" placeholder="age add"></th>
				</tr>
				
				<tr>
					<td colspan="2" align="right"><input type="submit" value="submit"></td>
				</tr>
			</table>
		
		</form>
	</body>
</html>