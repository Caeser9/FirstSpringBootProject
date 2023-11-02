package tn.esprit.firstspringbootproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.entities.Universite;
import tn.esprit.firstspringbootproject.repository.IUniversityRepository;

import java.util.List;
@Service
public class UniversityServiceImpl implements IUniversityService{
    @Autowired
    IUniversityRepository iUniversityRepository;

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
}
