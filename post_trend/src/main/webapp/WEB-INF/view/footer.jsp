<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2016 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>

    </div><!-- /.container -->
    
    
    
    
    <!-- Modal -->
    <!-- 모달은 body 최하단에 붙여줘야 오류가 안난다. -->
	<div class="modal fade" id="login_modal" tabindex="-1" role="dialog">
	   <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">로그인</h4>
	      </div>
	      <div class="modal-body">
		      <form id="login_form" class="form-signin" action="login_action">
		        <h2 class="form-signin-heading">로그인</h2>
		        <label for="inputEmail" class="sr-only">id</label>
		        <input type="text" id="inputEmail" class="form-control" placeholder="id" required autofocus>
		        <label for="inputPassword" class="sr-only">Password</label>
		        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
		        <div class="checkbox">
		          <label>
		            <input type="checkbox" value="remember-me"> 아이디 기억하기
		          </label>
		        </div>
		        <button id="login_btn" class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>
		      </form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
	        <button type="button" class="btn btn-primary">회원가입</button>
	      </div>
	    </div>
	  </div>
	</div>


        
  </body>
</html>