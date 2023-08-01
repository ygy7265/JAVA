<%@ page contentType="text/xml;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	 String xmlData = "<user>";
			xmlData += "<uid>a101</uid>";
			xmlData += "<name>kimyousin</name>";
			xmlData += "<hp>010-1234-111</hp>";
			xmlData += "<age>23</age>";
			xmlData += "</user>";
	
			
	out.print(xmlData);
%>