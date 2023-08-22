<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>4_JSTL</title>
		<!-- 
			date : 2023/08/22
			name : ygy
			content : JSTL
		 -->
	</head>
	<body>
		<h3>4.JSTL</h3>
		
		<h4>스크립트릿</h4>
		<%
			//변수선언
			String str = "hello";
			out.print("<p>str : "+str+"</p>");
			
			int num1 = 1;
			int num2 = 2;
			int num3 = 3;
			
			if(num1 < num2){
				out.print("<p>num1은 num2 보다 작다</p>");
			}
			if(num1 > num2){
				out.print("<p>num1은 num2 보다 크다</p>");
			}
			if(num1 < num2){
				out.print("<p>num1은 num2 보다 작다</p>");
			}
			
			int sum = 0;
			for(int i=1; i<=10; i++){
				sum += i;
			}
			out.print("<p>sum = "+sum+"</p>");
			
			String hello = "Hello Korea";
			
			out.print("<p>"+hello+"</p>");
			
			
		%>
		
		<h4>JSTL</h4>
		<!-- 변수선언 -->
		<c:set var="str" value="hello"/>
		<p>str : ${str}
		</p>
		<c:set var="num1" value="1"></c:set>
		<c:set var="num2" value="2"></c:set>
		<c:set var="num3" value="3"></c:set>
		<p>num1 : ${num1}</p>
		
		<!-- 조건문 -->
		<c:if test="${num1 lt num2 }">
				<p>num1 > num2</p>
		</c:if>
		
		<c:choose>
			<c:when test="${num1 gt num2 }">
				<p> num1 > num2</p>
			</c:when>
			<c:otherwise>
				<p> num1 < num2</p>
			</c:otherwise>
		</c:choose>
		<!-- 반복문 -->
		<c:forEach var="k" begin="1" end="10">
			<c:set var ="sum" value="${sum + k }"></c:set>
		</c:forEach>
			<p>${sum}</p>
		<!-- 문자열처리 -->
		<c:set var="hello" value="hello korea"/>
		<p>문자열 길이 = ${f:length(hello) }</p>
		<p>문자열 자르기 = ${f:substring(hello,6,11) }</p>
		<p>문자열 교체 = ${f:replace(hello,"korea","busan") }</p>
		<p>문자열 인덱스 = ${f:indexOf(hello,"e") }</p>
		
	</body>
</html>