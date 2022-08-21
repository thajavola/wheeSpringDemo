package mg.cdan4.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mg.cdan4.tp.entity.Produit;
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    
}
