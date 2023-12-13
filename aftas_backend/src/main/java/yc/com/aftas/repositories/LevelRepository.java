package yc.com.aftas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yc.com.aftas.entities.Level;

@Repository
public interface LevelRepository extends JpaRepository<Level, Integer> {


}
