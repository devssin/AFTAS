package yc.com.aftas.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import yc.com.aftas.dto.HuntingDto;
import yc.com.aftas.entities.Hunting;

@Mapper(componentModel = "spring")
public interface HuntingMapper {
    HuntingMapper huntingMapper = Mappers.getMapper(HuntingMapper.class);
    HuntingDto toDto(Hunting hunting);
    Hunting toEntity(HuntingDto huntingDto);

}
