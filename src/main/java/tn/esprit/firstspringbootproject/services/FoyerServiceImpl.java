package tn.esprit.firstspringbootproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.entities.Foyer;
import tn.esprit.firstspringbootproject.repository.IFoyerRepository;

import java.util.List;
@Service
public class FoyerServiceImpl implements IFoyerService{
    @Autowired
    IFoyerRepository iFoyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyer() {
        return iFoyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyer(Long foyerId) {
        return iFoyerRepository.findById(foyerId).get();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return iFoyerRepository.save(f);
    }

    @Override
    public void removeFoyer(Long foyerId) {
        iFoyerRepository.deleteById(foyerId);

    }

    @Override
    public Foyer modifyEtudiant(Foyer foyer) {
        return iFoyerRepository.save(foyer);
    }
}
