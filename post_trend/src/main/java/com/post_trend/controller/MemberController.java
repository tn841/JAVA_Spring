package com.post_trend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.post_trend.member.Member;
import com.post_trend.member.MemberServiceImpl;

@Controller
public class MemberController {

	@Autowired
	public MemberServiceImpl memberServiceImpl;
	
	@RequestMapping("/member_create")
	public void enrollMember(){
		
		Member member = new Member("myid6", "mypass", "myname", 0, "mygender", "myemail", "myjob", 0, 1);
		System.out.println("member insert:"+memberServiceImpl.enrollMember(member));
	}
	
	@RequestMapping("/member_delete")
	public void deleteMember(){
		System.out.println("member delete:"+memberServiceImpl.deleteMemberByID("222"));
	}
	
	@RequestMapping("/member_find")
	public void member_find(){
		System.out.println("member find by no:"+memberServiceImpl.findByMember_no(11).getMember_no());
		System.out.println("member find by id:"+memberServiceImpl.findByMember_id("4").getMember_id());
	}
	
	@RequestMapping("/member_update")
	public void member_update(){
		Member updateM = memberServiceImpl.findByMember_no(11);
		updateM.setMember_age(22);
		updateM.setMember_name("수정되었다.222222");
		updateM.setMember_favorite_no(2);
		System.out.println("updateM : "+updateM.getMember_name());
	
		System.out.println("member update : "+memberServiceImpl.update(updateM));			
		
	}
	
}
