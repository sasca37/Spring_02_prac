package com.example.core_prac.member;

public interface MemberService {
    // 회원 가입
    void join(Member member);

    // 조회
    Member findMember(Long id);
}
