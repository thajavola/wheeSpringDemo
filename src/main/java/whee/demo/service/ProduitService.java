package mg.cdan4.tp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mg.cdan4.tp.entity.Produit;
import mg.cdan4.tp.repository.ProduitRepository;

@Service
@Transactional
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> listAll(){
        return produitRepository.findAll();
    }
    
    public void save(Produit product){
        produitRepository.save(product);
    }

    public Produit get(long id){
        return produitRepository.findById(id).get();
    }

    public void delete(long id){
        produitRepository.deleteById(id);

    }
}
