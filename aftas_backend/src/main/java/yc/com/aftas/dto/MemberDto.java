package yc.com.aftas.dto;

import lombok.Builder;
import lombok.Data;
import yc.com.aftas.entities.Competition;
import yc.com.aftas.entities.Hunting;
import yc.com.aftas.enums.IdentityDocumentType;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class MemberDto {

    private int num;
    private String name;
    private String familtyName;
    private Date accessionDate;
    private String nationality;
    private IdentityDocumentType identityDocument;
    private String identityNumber;

    private List<Hunting> huntings;
    private List<Competition> competitions;



}
