package yc.com.aftas.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import yc.com.aftas.entities.Hunting;
import yc.com.aftas.entities.Member;

import java.sql.Time;
import java.util.Date;
import java.util.List;


@Data
@Builder
@Getter
@Setter
public class CompetitionDto {
    private String code;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    @JsonFormat(pattern = "HH:mm:ss")
    private Time startTime;
    @JsonFormat(pattern = "HH:mm:ss")
    private Time endTime;
    private int numberOfParticipants = 0;
    private String location;
    private float amount;

    private List<Member> members;
    private List<Hunting> huntings;

}
