package com.example.core_prac.map;

import com.example.core_prac.member.Grade;
import com.example.core_prac.member.Member;
import com.example.core_prac.member.MemberServiceImpl;
import com.example.core_prac.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;


public class TestMap {
    @Test
    void aa() {
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        Member member = new Member(10L, "a", Grade.VIP);
        //memberRepository.save(member);

        MemberServiceImpl memberService = new MemberServiceImpl();
        memberService.join(member);

        Member byId = memberRepository.findById(member.getId());
        System.out.println(byId.getId() + " / " +byId.getName() + " / " + byId.getGrade());
    }


}
