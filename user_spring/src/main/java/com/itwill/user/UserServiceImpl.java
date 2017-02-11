package com.itwill.user;

import java.util.List;

/*
 * - 회원관리 비즈니스로직(예외처리,트랜젝션,보안,로깅)을 수행하는 클래스
 * - 웹콤포넌트(서블릿,JSP)에서 직접접근(메쏘드호출)하는 클래스
 * - Dao를 이용해서 데이타베이스를 조작작업하는 클래스
 */
public class UserServiceImpl implements UserService {
	private UserDaoImplMyBatis userDao;
	
	public UserDaoImplMyBatis getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDaoImplMyBatis userDao) {
		this.userDao = userDao;
	}
	/*
	 * singleton
	 */
	private static UserService _instance;
	
	private UserServiceImpl() {
		System.out.println("UserService생성자:"+this);
		this.userDao=new UserDaoImplMyBatis();
	}
	public static UserService getInstance(){
		if(_instance==null){
			_instance=new UserServiceImpl();
		}
		return _instance;
	}
	
	
	/*
	 * 회원가입
	 */
	/* (non-Javadoc)
	 * @see com.itwill.user.UserService#create(com.itwill.user.User)
	 */
	@Override
	public int create(User user)throws Exception,ExistedUserException{
		/*
		 * 1.아이디존재여부체크
		 */
		if(userDao.existedUser(user.getUserId())){
			//이미존재하는아이디
			throw new ExistedUserException(user.getUserId()+" 는 이미 존재하는 아이디입니다.");
		}
		/*
		 * 2.회원가입
		 */
		int result=userDao.create(user);
		return result;
	}
	/*
	 *로그인
	 */
	/* (non-Javadoc)
	 * @see com.itwill.user.UserService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public User login(String userId,String password)throws Exception,UserNotFoundException,PasswordMismatchException{
		/*
		 * 1. 아이디존재여부
		 */
		User findUser=userDao.findUser(userId);
		if(findUser==null){
			throw new UserNotFoundException(userId+" 는 존재하지 않는 아이디 입니다."); 
		}
		/*
		 * 2. 패쓰워드 일치여부
		 */
		if(!findUser.isMatchPassword(password)){
			throw new PasswordMismatchException("암호가 일치하지 않습니다.");
		}
		return findUser;
		
	}
	/*
	 * 회원전체리스트
	 */
	
	/* (non-Javadoc)
	 * @see com.itwill.user.UserService#findUserList()
	 */
	@Override
	public List<User> findUserList()throws Exception{
		return userDao.findUserList();
	}
	
	/*
	 * 회원한명 보기
	 */
	/* (non-Javadoc)
	 * @see com.itwill.user.UserService#findUser(java.lang.String)
	 */
	@Override
	public User findUser(String userId) throws Exception{
		User findUser=userDao.findUser(userId);
		return findUser;
		
	}
	/*
	 * 회원삭제(탈퇴)
	 */
	/* (non-Javadoc)
	 * @see com.itwill.user.UserService#remove(java.lang.String)
	 */
	@Override
	public int remove(String userId)throws Exception{
		return userDao.remove(userId);
	}
	/*
	 * 회원수정
	 */
	/* (non-Javadoc)
	 * @see com.itwill.user.UserService#update(com.itwill.user.User)
	 */
	@Override
	public int update(User updateUser)throws Exception{
		return userDao.update(updateUser);
	}
	
}













