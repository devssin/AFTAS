package yc.com.aftas.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import yc.com.aftas.dto.RankingDto;
import yc.com.aftas.entities.Ranking;

@Mapper(componentModel = "spring")
public interface RankingMapper {
    RankingMapper rankingMapper = Mappers.getMapper(RankingMapper.class);
    RankingDto toDto(Ranking ranking);
    Ranking toEntity(RankingDto rankingDto);
}
