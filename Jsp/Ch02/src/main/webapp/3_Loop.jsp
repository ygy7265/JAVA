<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>3_Loop</title>
	</head>
	<body>
		
		<h3>3.Loop</h3>
		
		<h4>For</h4>
		<%
			for(int i=1; i<=3; i++){
				out.println("<p>i = " + i + "</p>");
			}
		%>
		<%
			for(int i=1; i<=3; i++){
		%>
			<p>i = <%=i %></p>
		<%
			}
		%>
		<h4>while</h4>
		<%
			int a = 1;
			while(a<=3){
				a++;
		%>
			<p>a = <%= a %></p>
		<%
			}
		%>
		<h4>gugudan</h4>
		<table border = 1>
			<tr>
			<%
				for(int i=2; i<=9; i++){
			%>
				<th><%= i %>Dan</th>
			<% }%>
			</tr>
			
			<%for(int j=2; j<=9; j++){
				
			%><tr>
			<%for(int k=1;k<=9;k++){ %>
			<td><%=j %>	<%=a %> <%= k %> = <%=k*j %></td>
				<%}%>
			</tr>
			<%} %>
		</table>
		
	</body>
</html>