<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../favicon.ico">

    <title>포스트 트렌드</title>

    <!-- Bootstrap core CSS -->
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    <link href="carousel/carousel.css" rel="stylesheet">
  </head>
<!-- NAVBAR
================================================== -->
  <body>
    <div class="navbar-wrapper">
      <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="main">
              	<img src="images/scrape_logo.jpg" width="40px"/> post trend
			  </a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li><a class="main_menu" href="realtime_board">실시간 검색어</a></li>
                <li><a class="main_menu" href="news_board">뉴스</a></li>
                <li><a class="main_menu" href="movie_board">영화</a></li>
                <li><a class="main_menu" href="music_board">노래</a></li>
                <li class="dropdown">
                  <a href="dashboard" class="dropdown-toggle main_menu" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">대시보드 <span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li><a class="main_menu" href="default_dashboard">기본 대시보드</a></li>
                    <li><a class="main_menu" href="custom_dashboard">맞춤형 대시보드</a></li>
                    <li><a class="main_menu" href="00_dashboard">00 대시보드</a></li>
                    <li role="separator" class="divider"></li>
                    <li class="dropdown-header">Nav header</li>
                    <li class="disabled"><a  href="#">준비중입니다..</a></li>
                   
                  </ul>
                </li>
              </ul>
              
            
              <ul class="nav navbar-nav navbar-right">
		        <li><a data-toggle="modal" data-target="#login_modal" href="#">로그인</a></li>
		        

		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> 00님 <span class="caret"></span></a>
		          <ul class="dropdown-menu">
		            <li><a href="#">마이페이지</a></li>
		            <li><a href="#">즐겨찾기</a></li>
		            <li role="separator" class="divider"></li>
		            <li><a href="#">로그아웃</a></li>
		          </ul>
		        </li>
		      </ul>
            	
            </div>
          </div>
        </nav>

      </div>
    </div>
    
    
        <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="dist/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="assets/js/ie10-viewport-bug-workaround.js"></script>
    
    
    <script>
	    $(document).ready(function(){
	    	console.log("strart");
	    	var eles = $(".main_menu");
	    	for(var i=0; i<eles.size(); i++){
	    		var ele = eles[i];
	    		var eleStr = $(eles[i]).attr('href');
	    		if(isActive(eleStr)){
	    			$(ele).parent().addClass('active');	//현재 활성화된 페이지 메뉴 글자 하이라이트
	    		}
	    		
	    	}
	    });
    	
    	function isActive(path){
    		var result = false;
    		if(location.pathname.includes(path)){
    			result = true;
    		}
    		return result;
    	}
		
    </script>
    
        <script>
    	$(document).ready(function(){
    		//console.log("로딩완료");
    		
    		//로그인 버튼 처리
    		$('#login_btn').on('click', function(){
    			console.log("로그인 처리");
    			$("#commentForm").validate();
    		});
    	});
    </script>
    
	