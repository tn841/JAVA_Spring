package com.itwill.user;

import java.util.List;

public interface UserService {

	/*
	 * 회원가입
	 */
	int create(User user) throws Exception, ExistedUserException;

	/*
	 *로그인
	 */
	User login(String userId, String password) throws Exception, UserNotFoundException, PasswordMismatchException;
	/*
	 * 회원전체리스트
	 */

	List<User> findUserList() throws Exception;

	/*
	 * 회원한명 보기
	 */
	User findUser(String userId) throws Exception;

	/*
	 * 회원삭제(탈퇴)
	 */
	int remove(String userId) throws Exception;

	/*
	 * 회원수정
	 */
	int update(User updateUser) throws Exception;

}