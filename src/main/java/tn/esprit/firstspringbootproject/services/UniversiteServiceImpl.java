package tn.esprit.firstspringbootproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.entities.Foyer;
import tn.esprit.firstspringbootproject.entities.Universite;
import tn.esprit.firstspringbootproject.repository.IFoyerRepository;
import tn.esprit.firstspringbootproject.repository.IUniversityRepository;

import java.util.List;

@Service
public class UniversiteServiceImpl implements IUniversity{
    @Autowired
    IUniversityRepository UniversiteRpo ;
    @Autowired
    IFoyerRepository FoyerRepo ;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return UniversiteRpo.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long UniversiteId) {
        return UniversiteRpo.findById(UniversiteId).get();
    }

    @Override
    public Universite addUniversite(Universite U) {
        return UniversiteRpo.save(U);
    }

    @Override
    public void removeUniversite(Long universiteId) {
        UniversiteRpo.deleteById(universiteId);
    }

    @Override
    public Universite modifyUniversite(Universite universite) {
        return UniversiteRpo.save(universite);
    }

    @Override
    public Foyer affectFoyerUniversite(long idFoyer, long idUniversite) {
        Foyer foyer =FoyerRepo.findById(idFoyer).get() ;
        Universite universite = UniversiteRpo.findById(idUniversite).get();
        foyer.setUniversite(universite);
        return foyer;
    }

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        Universite universite = UniversiteRpo.findById(idUniversite).get();
        universite.setFoyer(foyer);
        return foyer ;
    }


}
