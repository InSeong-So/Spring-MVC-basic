package com.spring.basic.member.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.spring.basic.member.Member;

//@Component
@Repository
public class MemberDao implements IMemberDao {

	private HashMap<String, Member> dbMap;
	
	public MemberDao() {
		dbMap = new HashMap<String, Member>();
	}

	@Override
	public Map<String, Member> memberInsert(Member member) {
		
		dbMap.put(member.getMemId(), member);
		return dbMap;
		
	}

	@Override
	public Member memberSelect(Member member) {
		
		Member mem = dbMap.get(member.getMemId());
		return mem;
		
	}

	@Override
	public Member memberUpdate(Member member) {
		
		dbMap.put(member.getMemId(), member);
		return dbMap.get(member.getMemId());
		
	}

	@Override
	public Map<String, Member> memberDelete(Member member) {
		
		dbMap.remove(member.getMemId());
		return dbMap;
		
	}
	
//	@Override
//	public void memberInsert(String memId, String memPw, String memMail, String memPhone1, String memPhone2, String memPhone3) {
//		System.out.println("memberInsert()");
//		System.out.println("memId : " + memId);
//		System.out.println("memPw : " + memPw);
//		System.out.println("memMail : " + memMail);
//		System.out.println("memPhone : " + memPhone1 + " - " + memPhone2 + " - " + memPhone3);
//		
//		Member member = new Member();
//		member.setMemId(memId);
//		member.setMemPw(memPw);
//		member.setMemMail(memMail);
//		member.setMemPhone1(memPhone1);
//		member.setMemPhone2(memPhone2);
//		member.setMemPhone3(memPhone3);
//		
//		dbMap.put(memId, member);
//		
//		Set<String> keys = dbMap.keySet();
//		Iterator<String> iterator = keys.iterator();
//		
//		while (iterator.hasNext()) {
//			String key = iterator.next();
//			Member mem = dbMap.get(key);
//			System.out.print("memberId:" + mem.getMemId() + "\t");
//			System.out.print("|memberPw:" + mem.getMemPw() + "\t");
//			System.out.print("|memberMail:" + mem.getMemMail() + "\t");
//			System.out.print("|memberPhone:" + mem.getMemPhone1() + " - " + 
//											   mem.getMemPhone2() + " - " + 
//											   mem.getMemPhone3() + "\n");
//		}
//		
//	}

	

}