package org.example.arutala.rental.buku.service;

import org.example.arutala.rental.buku.model.Member;
import org.example.arutala.rental.buku.repository.MemberRepository;

import java.util.List;

public class MemberServiceImpl implements MemberService {
    private MemberRepository memberRepository = new MemberRepository();

    @Override
    public Member getMemberByID(String memberID) {
        List<Member> memberList = memberRepository.getAllMember();
        return memberList.stream().
                filter(member -> member.getMemberID().equals(memberID))
                .findFirst()
                .orElse(null);
    }
}
