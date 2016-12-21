package com.itwill.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.itwill8.dao.mapper.UserMapper;

public class UserDaoImplMyBatis implements UserDao {
	public static final String namespace = "com.itwill8.dao.UserMapper.";
	
	//@Autowired
	private SqlSession sqlSession;
	
	public UserDaoImplMyBatis(){
		System.out.println("\t### UserDaoImplMyBatis() 생성자 호출");
	}
		
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		System.out.println("\t### UserDaoImplMyBatis().setSqlSeesion() 호출");
		this.sqlSession = sqlSession;
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
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		return userMapper.findUser(userId);
	}

	@Override
	public List<User> findUserList() throws Exception {
		//return sqlSession.selectList(namespace+"findUserList");
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		return userMapper.findUserList(); 
	}

	@Override
	public boolean existedUser(String userId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
