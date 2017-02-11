package com.itwill.user;

import java.util.List;

import com.itwill.user.User;

public interface UserMapper {
	public User findUser(String userId);
	public List<User> findUserList();
	public int create(User user);
}
