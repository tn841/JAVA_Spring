package com.itwill.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class UserDaoImplMyBatis implements UserDao {

	//@Autowired
	//private SqlSession sqlSession;	//sqlSession이용
	private UserMapper userMapper;	//Mapper Interface이용
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public UserDaoImplMyBatis(){
		System.out.println("\t### UserDaoImplMyBatis() 생성자 호출");
	}
		


	@Override
	public int create(User user) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User user) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(String userId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findUser(String userId) throws Exception {
		//return sqlSession.selectOne(namespace+"findUser", userId);
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		return userMapper.findUser(userId);
		return userMapper.findUser(userId); 
	}

	@Override
	public List<User> findUserList() throws Exception {
		//return sqlSession.selectList(namespace+"findUserList");
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		return userMapper.findUserList(); 
		return userMapper.findUserList(); 
	}

	@Override
	public boolean existedUser(String userId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
