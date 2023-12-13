package yc.com.aftas.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import yc.com.aftas.enums.IdentityDocumentType;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mun;
    private String name;
    private String familtyName;
    private Date accessionDate;
    private String nationality;
    private IdentityDocumentType identityDocument;
    private String identityNumber;

    @OneToMany(mappedBy = "member", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<Hunting> huntings;


    @ManyToMany(mappedBy = "members")
    private List<Competition> competitions;






}
