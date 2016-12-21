<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	InitialContext context = new InitialContext();
	DataSource ds = (DataSource) context.lookup("java:/comp/env/jdbc/OracleDB");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JNDI DataSource</h1><hr>
	<%=ds%><br>
	<%=ds.getConnection()%><br>
	
</body>
</html>