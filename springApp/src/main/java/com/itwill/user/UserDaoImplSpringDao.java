package com.itwill.user;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;


public class UserDaoImplSpringDao implements UserDao {
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		System.out.println("#### UserDaoSpringJDBC().setJdbcTemplate("+jdbcTemplate+") : setter 호출  ");
		this.jdbcTemplate = jdbcTemplate;
	}

	public UserDaoImplSpringDao() {
		System.out.println("#### UserDaoSpringJDBC() : 디폴트생성자 호출  ");
	}

	@Override
	public int create(User user) {
		int result = jdbcTemplate.update(UserSQL.USER_CREATE, user.getUserId(), user.getPassword(), user.getPassword(), user.getEmail());
		
		
		/***이런 방식도 있다***/
		Object[] args={user.getUserId(),user.getPassword(),user.getName(),user.getEmail()};
		int[] argTypes={java.sql.Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR};
		int insertCount=jdbcTemplate.update(UserSQL.USER_CREATE, args, argTypes);
		
		
		return result;
	}

	@Override
	public int update(User user) throws Exception {
		int result = jdbcTemplate.update(UserSQL.USER_UPDATE,user.getUserId(),user.getPassword(),user.getName(), user.getEmail());
		return result;
	}

	@Override
	public int remove(String userId) throws Exception {
		int result= jdbcTemplate.update(UserSQL.USER_REMOVE, userId);
		return result;
	}

	@Override
	public User findUser(String userId) throws Exception {
		/*return jdbcTemplate
				.queryForObject(UserSQL.USER_FIND,
								new UserRowMapper(),
								userId);*/
		return jdbcTemplate
				.queryForObject(UserSQL.USER_FIND,
						new BeanPropertyRowMapper<User>(User.class),	//RS의 메타데이터의 컬럼명과 Bean의 Property를 바탕으로 알아서 매칭해줌
						userId);
	}

	@Override
	public List<User> findUserList() throws Exception {
		//return jdbcTemplate.query(UserSQL.USER_FIND_LIST, new UserRowMapper());
		return jdbcTemplate.query(UserSQL.USER_FIND_LIST,
						new BeanPropertyRowMapper<User>(User.class));
	}

	public Map<String, Object> findUserMap(String userId){
		return jdbcTemplate.queryForMap(UserSQL.USER_FIND, userId);
	}
	
	public List<Map<String, Object>> findUserListMap() {
		return jdbcTemplate.queryForList(UserSQL.USER_FIND_LIST);
	}
	
	
	@Override
	public boolean existedUser(String userId) throws Exception {
		Integer count = jdbcTemplate.queryForObject(UserSQL.USER_EXISTED, Integer.class, userId);
		if(count == 1){
			return true;
		}
		return false;
	}
	
	
}














