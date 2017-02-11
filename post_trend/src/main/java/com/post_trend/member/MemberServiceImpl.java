package com.post_trend.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	
	public MemberDaoImpl memberDao;
	
	public void setMemberDao(MemberDaoImpl memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public int enrollMember(Member member) {
		return memberDao.create(member);
	}

	@Override
	public int deleteMemberByNO(int member_no) {
		return memberDao.delete(member_no);
	}

	@Override
	public int deleteMemberByID(String member_id) {
		// TODO Auto-generated method stub
		return memberDao.deleteByID(member_id);
	}

	@Override
	public Member findByMember_no(int member_no) {
		// TODO Auto-generated method stub
		return memberDao.findByMember_no(member_no);
	}

	@Override
	public Member findByMember_id(String member_id) {
		// TODO Auto-generated method stub
		return memberDao.findByMember_id(member_id);
	}

	@Override
	public int update(Member member) {
		// TODO Auto-generated method stub
		return memberDao.update(member);
	}

}
