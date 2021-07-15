package com.example.core_prac.member;

public class MemberServiceImpl implements MemberService{
    private final MemoryMemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return memberRepository.findById(id);
    }
}
