package yc.com.aftas.dto;


import lombok.Builder;
import lombok.Data;
import yc.com.aftas.entities.Hunting;

import javax.swing.*;
import java.util.List;

@Data
@Builder
public class FishDto {
    private String name;
    private Float averageWeight;

    private List<Hunting> huntings;
}
