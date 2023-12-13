package yc.com.aftas.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import yc.com.aftas.dto.LevelDto;
import yc.com.aftas.entities.Level;

@Mapper(componentModel = "spring")
public interface LevelMapper {
    LevelMapper levelMapper = Mappers.getMapper(LevelMapper.class);
    LevelDto toDto(Level level);
    Level toEntity(LevelDto huntingDto);
}
