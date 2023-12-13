package yc.com.aftas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yc.com.aftas.entities.Competition;

import java.util.Date;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, String> {

    public Competition findByCode(String code);
    public Competition findByDate(Date date);
}
