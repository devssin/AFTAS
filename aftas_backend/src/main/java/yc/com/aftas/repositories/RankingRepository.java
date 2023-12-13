package yc.com.aftas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yc.com.aftas.entities.Ranking;
import yc.com.aftas.entities.RankingId;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, RankingId> {
}
