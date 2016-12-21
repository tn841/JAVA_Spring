package com.itwill.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.itwill8.dao.mapper.UserMapper;

public class UserDaoImplMyBatisMapper implements UserDao {
	public static final String namespace = "com.itwill8.dao.UserMapper.";
	
	//@Autowired
	//private SqlSession sqlSession;
	private UserMapper userMapper;
	
	public UserDaoImplMyBatisMapper(){
		System.out.println("\t### UserDaoImplMyBatis() 생성자 호출");
	}
		
	

	public UserMapper getUserMapper() {
		return userMapper;
	}



	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}



	@Override
	public int create(User user) throws Exception {
		return userMapper.create(user);
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
		return userMapper.findUser(userId);
	}

	@Override
	public List<User> findUserList() throws Exception {
		//return sqlSession.selectList(namespace+"findUserList");
		return userMapper.findUserList(); 
	}

	@Override
	public boolean existedUser(String userId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
