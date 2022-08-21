package mg.cdan4.tp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mg.cdan4.tp.entity.Entree;
@Repository
public interface EntreeRepository extends JpaRepository<Entree, Integer> {

    List<Entree> findByNent(@Param("nent") String nent);
    
}
