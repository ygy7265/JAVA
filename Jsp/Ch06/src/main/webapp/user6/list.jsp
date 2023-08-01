<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user6::list</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$.ajax({
					url:'./listProc.jsp',
					type:'GET',
					dataType:'json',
					success: function(data){
						for(let user of data){
							let tr = `<tr>
										<td>\${user.uid}</td>
										<td>\${user.name}</td>
										<td>\${user.hp}</td>
										<td>\${user.age}</td>
										<td>
											<a href="./modify.jsp?uid=\${user.uid}">Update</a>
											<a href="./delete.jsp?uid=\${user.uid}" class="del">Delete</a>
										</td>
										</tr>`;
										
							$('table').append(tr);	
						}
					}
				})
				$(document).on('click', '.del', function(e){
					  e.preventDefault();
					  let uid = $(this).attr('href').split('=')[1]; // 클릭한 요소의 href에서 uid 값을 추출

					  $.post('./delete.jsp', { uid: uid }, function(data){
					    if (data.result >= 1) {
					      alert('데이터가 수정 되었습니다.');
					      location.href = './list.jsp'; // 리다이렉트를 콜백 함수 내부로 이동
					    } else {
					      alert('데이터 수정이 실패했습니다.');
					    }
					  });
					});

						
				
				
			});
		</script>
	</head>
	<body>
	<h3>User6 Add</h3>
		
		
		<table border="1">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>hp</th>
				<th>age</th>
			</tr>
			
			
		</table>
		
			<a href="/Ch06/user6/register.jsp">add</a>
			<a href="/Ch06/1_JDBC.jsp">index</a>
	</body>
</html>