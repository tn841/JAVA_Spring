package com.itwill.user;

import java.util.List;

public class UserServiceImpl implements UserService {
	private String serviceName;
	private UserDao userDao;
	public UserServiceImpl() {
		System.out.println("#### UserServiceImpl() : 디폴트생성자호출");
	}
	
	public UserServiceImpl(UserDao userDao) {
		System.out.println("#### UserServiceImpl("+userDao+") :생성자호출");
		this.userDao=userDao;
	}
	public void setUserDao(UserDao userDao) {
		System.out.println("#### UserServiceImpl.setUserDao("+userDao+") :호출");
		this.userDao = userDao;
	}
	public String getServiceName() {
		
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		System.out.println("#### UserServiceImpl.setServiceName("+serviceName+") :호출");
		this.serviceName = serviceName;
	}

	public int create(User user) throws ExistedUserException, Exception {
		System.out.println("#### UserServiceImpl : create() 호출");
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
	 * User 상세보기
	 */
	public User findUser(String userId) throws UserNotFoundException, Exception {

		System.out.println("#### UserServiceImpl : findUser() 호출");
		User findUser=userDao.findUser(userId);
		return findUser;

	}

	/*
	 * 로그인
	 */
	public User login(String userId, String password)
			throws UserNotFoundException, PasswordMismatchException, Exception {
		// 입력되는 아이디로 User 찾아오기
		System.out.println("#### UserServiceImpl : login() 호출");
		/*
		 * 1. 아이디존재여부
		 */
		User findUser=userDao.findUser(userId);
		if(findUser==null){
			throw new UserNotFoundException(userId+" 는 존재하지않는 아이디입니다."); 
		}
		/*
		 * 2. 패쓰워드 일치여부
		 */
		if(!findUser.isMatchPassword(password)){
			throw new PasswordMismatchException("패쓰워드가 일치하지않습니다.");
		}
		return findUser;
		

	}

	public int update(User user) throws Exception {
		System.out.println("#### UserServiceImpl : update() 호출");
		return userDao.update(user);
	}

	public int remove(String userId) throws Exception {
		System.out.println("#### UserServiceImpl : remove() 호출");
		return userDao.remove(userId);
	}

	public List<User> findUserList() throws Exception {
		System.out.println("#### UserServiceImpl : findUserList() 호출  ");
		return userDao.findUserList();
	}

}
