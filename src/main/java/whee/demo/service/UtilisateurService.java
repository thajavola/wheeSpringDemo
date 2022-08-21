package mg.cdan4.tp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mg.cdan4.tp.entity.Utilisateur;
import mg.cdan4.tp.repository.UtilisateurRepository;

@Service
@Transactional
public class UtilisateurService {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> listAll() {
        return utilisateurRepository.findAll();
    }

}
