package yc.com.aftas.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import yc.com.aftas.dto.MemberDto;
import yc.com.aftas.entities.Member;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    MemberMapper memberMapper = Mappers.getMapper(MemberMapper.class);
    MemberDto toDto(Member member);
    Member toEntity(MemberDto memberDto);
}
