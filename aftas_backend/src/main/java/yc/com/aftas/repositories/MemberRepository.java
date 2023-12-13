package yc.com.aftas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yc.com.aftas.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {


}
