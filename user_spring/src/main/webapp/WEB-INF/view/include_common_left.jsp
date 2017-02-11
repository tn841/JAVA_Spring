<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>	
<%
	String sUserId=(String)session.getAttribute("sUserId");
	String jsf="userLoginLeft();";
	if(sUserId!=null){
		jsf="userListLeft();";
	}
%>    		
<p>
	<strong>메 뉴</strong>
</p>
<ul>
	 <%if(sUserId!=null){ %>
		<li><a href=""><%=sUserId%>님</a>&nbsp;<a href="logout_action">로그아웃</a></li>
	 <%}else{ %>	
		<li><a href="login_form">로그인</a></li>
	 <%}%>	
		<li><a></a></li>
		<li><a href="javascript:<%=jsf%>">회원관리</a></li>
</ul>
<script type="text/javascript">
	function userLoginLeft(){
		alert('로그인하세요');
		location.href='login_form';
	}
	function userListLeft(){
		location.href='list';
	}
</script>









