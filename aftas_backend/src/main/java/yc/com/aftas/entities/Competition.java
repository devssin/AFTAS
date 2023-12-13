package yc.com.aftas.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Competition {
    @Id
    private String code;
    private Date date;
    private Time startTime;
    private Time endTime;
    private int numberOfParticipants;
    private String location;
    private float amount;

    @ManyToMany
    @JoinTable(name = "ranking",
            joinColumns = @JoinColumn(name = "competition_code"),
            inverseJoinColumns = @JoinColumn(name = "member_num"))
    private List<Member> members;

    @OneToMany(mappedBy = "competition", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<Hunting> huntings;


}
