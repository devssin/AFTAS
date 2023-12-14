package yc.com.aftas.services;

import yc.com.aftas.dto.MemberDto;

import java.util.List;

public interface IMemberService {
    public MemberDto createMember(MemberDto memberDto);
    public MemberDto getMemberById(Long id);
    public void deleteMember(Long id);
    public List<MemberDto> getAllMembers();

}
