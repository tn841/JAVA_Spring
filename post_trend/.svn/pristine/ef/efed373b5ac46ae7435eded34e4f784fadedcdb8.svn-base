package com.post_trend.member;

import com.post_trend.mapper.MemberMapper;

public class MemberDaoImpl implements MemberDao{
	
	MemberMapper memberMapper;
	
	public void setMemberMapper(MemberMapper memberMapper) {
		System.out.println(" ** MemberDao에서 memberMapper set ** : "+memberMapper);
		this.memberMapper = memberMapper;
	}

	@Override
	public int create(Member member) {
		return memberMapper.createMember(member);
	}

	@Override
	public int update(Member member) {
		// TODO Auto-generated method stub
		return memberMapper.updateMember(member);
	}

	@Override
	public int delete(int member_no) {
		// TODO Auto-generated method stub
		return memberMapper.deleteMemberByNO(member_no);
	}
	
	
	@Override
	public int deleteByID(String member_id) {
		// TODO Auto-generated method stub
		return memberMapper.deleteMemberByID(member_id);
	}

	@Override
	public Member findByMember_no(int member_no) {
		// TODO Auto-generated method stub
		return memberMapper.findByMember_no(member_no);
	}

	@Override
	public Member findByMember_id(String member_id) {
		// TODO Auto-generated method stub
		return memberMapper.findByMember_id(member_id);
	}
	
	
	
}
