package yc.com.aftas.dto;

import jakarta.persistence.EmbeddedId;
import lombok.Builder;
import lombok.Data;
import yc.com.aftas.entities.Competition;
import yc.com.aftas.entities.Member;
import yc.com.aftas.entities.RankingId;

@Data
@Builder
public class RankingDto {
    @EmbeddedId
    private RankingId id;
    private Competition competition;
    private Member member;
    private int rank;
    private int score;
}
