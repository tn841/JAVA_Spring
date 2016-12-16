<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%
	request.setAttribute("pt", "page.title");
	request.setAttribute("id", "guard");
	request.setAttribute("page", "index.jsp");
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Spring CustomTag EL 을 사용한 국제화[I18N]</h1><hr/>
<ol>
	<li><s:message code="page.title"/></li>
	<li>EL사용:<s:message code="${pt}"/></li>
	<li><s:message code="button.login"/></li>
	<li><s:message code="user.id"/></li>
	<li><s:message code="user.remove.message"/></li>
	<!-- exception.userexisted =  {0} 사용자가 존재합니다..!!-->
	<li><s:message code="exception.userexisted" arguments="xxx"/></li>
	<li><s:message code="exception.userexisted" arguments="${id}"/></li>
	<li>-------SPEL-----------</li>
	<li>@messageSource.toString():
		<s:eval expression="@messageSource.toString()"/>
	</li>
	<li>
		<s:eval 
expression="@messageSource.getMessage('page.title',new java.lang.Object[]{},new java.util.Locale('ko','KR'))"/>
		<br/>
		<s:eval 
expression="@messageSource.getMessage('page.title',new java.lang.Object[]{},new java.util.Locale('en','US'))"/>
		<br/>
		<s:eval 
expression="@messageSource.getMessage('exception.userexisted',new java.lang.Object[]{'test'},new java.util.Locale('',''))"/>
		<br/>
		<s:eval 
expression="@messageSource.getMessage('ssssss.xxxxx',null,'없다...',new java.util.Locale('',''))"/>

	</li>
</ol>	
<hr/>
<h3>&lt;util:properties id="messages" location="classpath:messages/messages.properties"  /&gt;</h3>
<!-- <util:properties id="messages" location="classpath:messages/messages.properties" /> -->	

<ol>
	<li><s:eval expression="@messages.toString()"/></li>
	<li><s:eval expression="@messages.getProperty('email.not.send')"/></li>
	<li><s:eval expression="@messages['email.not.send']"/></li>
</ol>
</body>
</html>





