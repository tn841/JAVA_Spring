package com.itwill.user.annotation;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.itwill.user.User;
import com.itwill.user.UserDao;
import com.itwill.user.UserSQL;

@Repository("springUserDao")
public class UserDaoImplSpringDaoAnnotation implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public UserDaoImplSpringDaoAnnotation() {
		System.out.println("#### UserDaoImplSpringDao() : 디폴트생성자 호출  ");
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		
		System.out.println("#### UserDaoImplSpringDao.setJdbcTemplate() :메쏘드 호출  ");
		this.jdbcTemplate = jdbcTemplate;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Override
	public int create(User user){
		/*
		int insertCount=
				jdbcTemplate
					.update(UserSQL.USER_CREATE,
							user.getUserId(),
							user.getPassword(),
							user.getName(),
							user.getEmail());
		
		*/
		Object[] args={user.getUserId(),user.getPassword(),user.getName(),user.getEmail()};
		int[] argTypes={java.sql.Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR};
		
		int insertCount=
				jdbcTemplate
				.update(UserSQL.USER_CREATE,
						args,
						argTypes);
		
		return insertCount;
	}

	@Override
	public int update(User user) throws Exception {
		// TODO Auto-generated method stub
		return jdbcTemplate
				.update(UserSQL.USER_UPDATE,
						user.getUserId(),
						user.getPassword(),
						user.getName(),
						user.getEmail()
						);
	}

	@Override
	public int remove(String userId) throws Exception {
		
		return jdbcTemplate
					.update(UserSQL.USER_REMOVE,
							userId);
	}
	/***************Map,List<Map>***********************/
	public Map<String, Object> findUserMap(String userId){
		Map<String,Object> userMap = 
				jdbcTemplate.queryForMap(UserSQL.USER_FIND,userId);
		return userMap;
	}
	public List<Map<String, Object>> findUserListMap(){
		List<Map<String, Object>> userMapList = 
				jdbcTemplate
				.queryForList(UserSQL.USER_FIND_LIST);
		return userMapList;
	}
	
	
	@Override
	public User findUser(String userId) throws Exception {
		/*
		return jdbcTemplate
			.queryForObject(UserSQL.USER_FIND,
							new UserRowMapper(),
							userId);
		*/
		
		return jdbcTemplate
				.queryForObject(UserSQL.USER_FIND,
								new BeanPropertyRowMapper<User>(User.class),
								userId);
	}

	@Override
	public List<User> findUserList() throws Exception {
		/*
		return jdbcTemplate.query(UserSQL.USER_FIND_LIST,
								  new UserRowMapper());
		*/
		return jdbcTemplate.query(UserSQL.USER_FIND_LIST,
				  new BeanPropertyRowMapper<User>(User.class));
	}

	@Override
	public boolean existedUser(String userId) throws Exception {
		Integer userCount=
				jdbcTemplate.queryForObject(UserSQL.USER_EXISTED,Integer.class,userId);
		if(userCount==1){
			return true;
		}else{
			return false;
		}	
		
	}
	
	
}














