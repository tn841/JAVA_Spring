package com.post_trend.member;

public interface MemberDao {
	
	public int create(Member member);
	
	public int update(Member member);
	
	public int delete(int member_no);
	public int deleteByID(String member_id);
	
	public Member findByMember_no(int member_no);
	
	public Member findByMember_id(String memeber_id);
	

}
