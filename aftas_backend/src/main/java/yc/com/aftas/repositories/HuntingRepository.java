package yc.com.aftas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yc.com.aftas.entities.Hunting;

@Repository
public interface HuntingRepository extends JpaRepository<Hunting, String> {
}
