package yc.com.aftas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yc.com.aftas.entities.Fish;

@Repository
public interface FishRepository extends JpaRepository<Fish, String> {
    public Fish findByName(String name);

}
