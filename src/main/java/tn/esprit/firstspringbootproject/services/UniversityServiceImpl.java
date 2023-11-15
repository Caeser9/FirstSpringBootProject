package tn.esprit.firstspringbootproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.entities.Foyer;
import tn.esprit.firstspringbootproject.entities.Universite;
import tn.esprit.firstspringbootproject.repository.IFoyerRepository;
import tn.esprit.firstspringbootproject.repository.IUniversityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityServiceImpl implements IUniversityService{
    @Autowired
    IUniversityRepository iUniversityRepository;
    @Autowired
    IFoyerRepository iFoyerRepository;

    @Override
    public List<Universite> retrieveAllUniversite() {
        return iUniversityRepository.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long universiteId) {
        return iUniversityRepository.findById(universiteId).get();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return iUniversityRepository.save(u);
    }

    @Override
    public void removeUniversite(Long universiteId) {
        iUniversityRepository.deleteById(universiteId);
    }

    @Override
    public Universite modifyUniversite(Universite universite) {
        return iUniversityRepository.save(universite);
    }

    @Override
    public Universite affectUniversiteFoyer(Long idFoyer, Long idUnivsercite) {

            Universite u=iUniversityRepository.findById(idUnivsercite).get();
            Foyer f = iFoyerRepository.findById(idFoyer).get();
            u.setFoyer(f);
            return u;
    }


}
