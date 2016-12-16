<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("sUserId", "xxxx");
%>    
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>SPEL(Spring EL)[ Spring custom eval tag 안의 expression 애트리뷰트표현식 ]</h1><hr/>
<p>
	1.모델오브젝트를 직접 사용할수있다.<br/>
	2.모델오브젝트 메쏘드의 리턴값이 String일경우 메쏘드자체를 호출할수있다<br/>
	3.스프링 빈컨테이너에 등록된 빈의 메쏘드의 반환형이 String인경우 호출가능<br/>
</p>
<ul>
	<li>문자열상수:<s:eval expression="'kim'" /></li>
	<li>
	1.model 의 guest 애트리뷰트 호출:
		<s:eval expression="guest.guest_name"/> 
	</li>
	<li>
	2.model 의 guest 애트리뷰트 메쏘드호출:
		<s:eval expression="guest.toString().toUpperCase()"/> 
	</li>
	<li>
	3.model에 var_today 변수(attribute)등록:
		<s:eval var="var_today" 
			expression="'2016/12/12'" />
	</li>
	<li>
	4.EL var_today 애트리뷰트 출력:
		${var_today} : ${var_today.substring(0,4)}
	</li>
	<li>
	4.SPEL var_today 애트리뷰트 출력:
		<s:eval expression="var_today"/>
	</li>
	<li>guest homepage:
		<s:eval expression="guest.guest_homepage.toUpperCase()"/></li>
	<li>guest title:
		<s:eval expression="guest.guest_title.toUpperCase()"/></li>
	<li>guest content:
		<s:eval expression="guest.guest_content.toUpperCase()"/></li>
	<li>
		new java.util.Date():
		<s:eval 
			expression="'오늘은 '+ new java.util.Date()+' 입니다.'"/>
	</li>
	<li>
		<s:eval var="price" expression="58123457"/>
		<s:eval var="name" expression="'kim kyung ho'"/>
		
		<s:eval 
		expression="new java.text.DecimalFormat('###,##0').format(price)"/>
		<br/>
		<s:eval expression="'${sUserId}'+' 님 어서와요!!'"/>
	</li>
	<li>
		5.@를 이용하여 Spring Bean 사용가능
		- elBean:<s:eval expression="@elBean.toString()"/><br/>
		- elBean.getMember1():
			<s:eval expression="@elBean.member1"/><br/>
		- elBean.getMember2():
			<s:eval expression="@elBean.getMember2()"/><br/>
		- elBean.printMember():
		    <s:eval expression="@elBean.printMember()"/>	
			
	</li>
	
</ul>
<br/>
</body>






</html>