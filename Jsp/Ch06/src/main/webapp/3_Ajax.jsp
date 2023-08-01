<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 
	Date : 2023/07/31
	Name : Yoongyeongyeop
	Content : AJAX
 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>3.AJAX</title>
		
		<script type="text/javascript">
			window.onload = function(){	
				
				const btn1 = document.getElementById("btn1");
				const spans = document.getElementsByTagName("span");
				const tds = document.getElementsByTagName("td");
				
				btn1.onclick = function(){
					const xhr = new XMLHttpRequest();
					xhr.open('GET','/Ch06/data/json1.jsp');
					xhr.send();
					
					xhr.onreadystatechange = function(){
						
						if(xhr.readyState == XMLHttpRequest.DONE){
							
							if(xhr.status == 200){
								const data = JSON.parse(xhr.response);
								
								spans[0].innerText = data.uid;
								spans[1].innerText = data.name;
								spans[2].innerText = data.hp;
								spans[3].innerText = data.age
							}
						}
					};
				}
				
				const btn2 = document.getElementById('btn2');
				const table1 = document.getElementById('table1');
				
				btn2.addEventListener('click',function(){
					
					fetch('/Ch06/data/json2.jsp')
						.then((res)=>{				
							return res.json();
						})
						.then(data=>{
							
							for(let idx of data){
							console.log(data);
							
							const tr = document.createElement('tr');
							const td1 = document.createElement('td');
							const td2 = document.createElement('td');
							const td3 = document.createElement('td');
							const td4 = document.createElement('td');
							
							td1.innerText = idx.uid;
							td2.innerText = idx.name;
							td3.innerText = idx.hp;
							td4.innerText = idx.age;
							
							tr.appendChild(td1);
							tr.appendChild(td2);
							tr.appendChild(td3);
							tr.appendChild(td4);
							
							table1.appendChild(tr);
							}
							
						});
						
				});
			};
		</script>
	</head>
	<body>
		<h3>3.AJAX</h3>
		
		<h4>Json/xml</h4>
		<a href="./data/json1.jsp">JSON DATA Create</a>
		<a href="./data/json2.jsp">JSON2 DATA Create</a>
		<a href="./data/xml1.jsp">XML DATA Create</a>
		<a href="./data/xml2.jsp">XML2 DATA Create</a>
		
		<h4>AJAX</h4>
		<button id = "btn1">data request</button>
		<p>
			id   = <span></span><br>
			name = <span></span><br>
			hp   = <span></span><br>
			age  = <span></span><br>
		</p>
		
		<button id = "btn2">data request</button>
		<table border="1" id="table1">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>hp</th>
				<th>age</th>
			</tr>
		</table>
	</body>
</html>