<%@page import="org.jsoup.select.Elements"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String jsondata = (String)request.getAttribute("jsondata");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>json data </title>
</head>
<body>
	<h1>JSON</h1><hr>
	<ol>
	<%= jsondata%>
	</ol>
	
	<script>
	<%= jsondata%>
	</script>
</body>
</html>