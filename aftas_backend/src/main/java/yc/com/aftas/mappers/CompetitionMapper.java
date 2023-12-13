package yc.com.aftas.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import yc.com.aftas.dto.CompetitionDto;
import yc.com.aftas.entities.Competition;

@Mapper(componentModel = "spring")
public interface CompetitionMapper {

    CompetitionMapper competitionMapper = Mappers.getMapper(CompetitionMapper.class);

    CompetitionDto toDto(Competition competition);
    Competition toEntity(CompetitionDto competitionDto);
}
