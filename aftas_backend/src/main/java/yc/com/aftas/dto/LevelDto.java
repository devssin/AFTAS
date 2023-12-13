package yc.com.aftas.dto;

import lombok.Builder;
import lombok.Data;
import yc.com.aftas.entities.Fish;

import java.util.List;

@Builder
@Data
public class LevelDto {
    private int code;
    private String description;
    private int points;
    private List<Fish> fishes;



}
