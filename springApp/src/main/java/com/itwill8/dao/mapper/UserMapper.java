package com.itwill8.dao.mapper;

import java.util.List;

import com.itwill.user.User;

public interface UserMapper {
	public User findUser(String id);
	public List<User> findUserList();
	public int create(User user);
}
