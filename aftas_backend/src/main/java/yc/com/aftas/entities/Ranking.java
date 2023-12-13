package yc.com.aftas.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity

public class Ranking {

    @EmbeddedId
    private RankingId id;

    @ManyToOne()
    @JoinColumn(name = "competition_code",  insertable = false, updatable = false)
    private Competition competition;

    @ManyToOne()
    @JoinColumn(name = "member_num",  insertable = false, updatable = false)
    private Member participant;


    private int rank;

    private int score;
}
