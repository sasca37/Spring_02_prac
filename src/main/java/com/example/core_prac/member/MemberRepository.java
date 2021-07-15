package com.example.core_prac.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
