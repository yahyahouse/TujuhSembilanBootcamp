package org.example.arutala.rental.buku.repository;

import org.example.arutala.rental.buku.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    public List<Member> getAllMember() {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("M-001", "Risman", "Bandung"));
        memberList.add(new Member("M-002", "Budi", "Bandung"));
        memberList.add(new Member("M-003", "Resti", "Kab. Bandung"));
        return memberList;
    }
}
