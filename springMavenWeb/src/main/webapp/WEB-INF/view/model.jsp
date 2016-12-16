<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Controller-->jsp 로 데이타전달</h1><hr/>
<ol>
	<li>request : ${requestScope.request}</li>
	<li>Model   : ${requestScope.model}</li>
	<li>Map   : ${requestScope.map}</li>
	<li>ModelMap   : ${requestScope.model_map}</li>
	<li>ModelAndView   : ${requestScope.model_view}</li>
</ol>
</body>
</html>