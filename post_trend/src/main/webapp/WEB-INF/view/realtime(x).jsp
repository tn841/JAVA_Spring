<%@page import="com.post_trend.realtime.Realtime"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% //taglib uri="http://java.sun.com/jstl/core" prefix="core" uri주의할것.. 틀림%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>네이버 실시간 검색어</h1>
<h3>기준: ${naver_list[0].realtime_standard}</h3><br>
<ol>
	<core:forEach items="${naver_list }" var="row" begin="0" varStatus="status">
		<li><a href="${row.realtime_url }">${row.realtime_keyword }</a></li>	
	</core:forEach>
</ol>
<br>
<br>
<h1>다음 실시간 검색어</h1>
<h3>기준: ${daum_list[0].realtime_standard}</h3><br>
<ol>
	<core:forEach items="${daum_list }" var="row" begin="0" varStatus="status">
		<li><a href="${row.realtime_url }">${row.realtime_keyword }</a></li>	
	</core:forEach>
</ol>
</body>
</html>