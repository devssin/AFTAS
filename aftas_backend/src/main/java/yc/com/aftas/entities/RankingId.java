package yc.com.aftas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class RankingId implements Serializable {

    @Column(name = "member_num")
    private Integer memberNum;

    @Column(name = "competition_code")
    private String competitionCode;

}
