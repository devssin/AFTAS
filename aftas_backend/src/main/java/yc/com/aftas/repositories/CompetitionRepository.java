package yc.com.aftas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import yc.com.aftas.entities.Competition;

import java.util.Date;

@Component
public interface CompetitionRepository extends JpaRepository<Competition, String> {

    Competition findByCode(String code);
    Competition findByDate(Date date);
}
