package yc.com.aftas.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Fish {
    @Id
    private String name;
    private Float averageWeight;

    @ManyToOne
    @JoinColumn(name = "level_code")
    private Level level;

    @OneToMany(mappedBy = "fish", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<Hunting> huntings;




}
