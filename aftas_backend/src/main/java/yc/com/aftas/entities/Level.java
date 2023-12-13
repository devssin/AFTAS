package yc.com.aftas.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    private String description;
    private int points;

    @OneToMany(mappedBy = "level", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<Fish> fishes;

}
