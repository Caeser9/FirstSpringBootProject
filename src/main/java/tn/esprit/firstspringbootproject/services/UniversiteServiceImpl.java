package tn.esprit.firstspringbootproject.services;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
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
    IUniversityRepository UniversiteRepo ;
    @Autowired
    IFoyerRepository FoyerRepo ;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return UniversiteRepo.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long UniversiteId) {
        return UniversiteRepo.findById(UniversiteId).get();
    }

    @Override
    public Universite addUniversite(Universite U) {
        return UniversiteRepo.save(U);
    }

    @Override
    public void removeUniversite(Long universiteId) {
        UniversiteRepo.deleteById(universiteId);
    }

    @Override
    public Universite modifyUniversite(Universite universite) {
        return UniversiteRepo.save(universite);
    }

//    @Override
//    public Foyer affectFoyerUniversite(long idFoyer, long idUniversite) {
//        Foyer foyer =FoyerRepo.findById(idFoyer).get() ;
//        Universite universite = UniversiteRpo.findById(idUniversite).get();
//        foyer.setUniversite(universite);
//        return foyer;
//    }
    @Override
    public Foyer affectFoyerUniversite(long idFoyer, long idUniversite) {
        Foyer foyer = FoyerRepo.findById(idFoyer).get();
        Universite universite = UniversiteRepo.findById(idUniversite).get();
        foyer.setUniversite(universite);
        return foyer;
    }
    @Transactional
    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        Universite universite = UniversiteRepo.findById(idUniversite).get();

        foyer.setUniversite(universite);
        return FoyerRepo.save(foyer);
    }

    

}
