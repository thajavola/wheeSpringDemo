package mg.cdan4.tp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import mg.cdan4.tp.entity.Entree;
import mg.cdan4.tp.repository.EntreeRepository;



@Service
@Transactional
public class EntreeService {
    @Autowired
    private EntreeRepository entreeRepository;

    public List<Entree> listAll(){
        return entreeRepository.findAll();
    }

    public List<Entree> listByNent(String nent){
        return entreeRepository.findByNent(nent);
    }
    public void save(Entree entree){
        entreeRepository.save(entree);
    }
    public Entree get(Integer ident){
        return entreeRepository.findById(ident).get();
    }
    public void delete(Integer ident){
        entreeRepository.deleteById(ident);
    }
    
}
