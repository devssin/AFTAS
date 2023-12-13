package yc.com.aftas.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import yc.com.aftas.dto.FishDto;
import yc.com.aftas.entities.Fish;

@Mapper(componentModel = "spring")
public interface FishMapper {

    FishMapper fishMapper = Mappers.getMapper(FishMapper.class);
    FishDto toDto(Fish fish);
    Fish toEntity(FishDto fishDto);


}
