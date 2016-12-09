package com.itwill.user;

public class UserSQL {
	public static final String USER_CREATE = "insert into userinfo values(?,?,?,?)";	
	public final static String USER_UPDATE = "update userinfo set password=?,name=?,email=? where userid=?";
	public final static String USER_REMOVE = "delete from userinfo where userid=?";
	public final static String USER_FIND = "select userid,password,name,email from userinfo where userid=?";
	public final static String USER_FIND_LIST = "select userid,password,name,email from userinfo";
	public final static String USER_EXISTED	= "select count(*) cnt from userinfo where userid=?";
	
}
