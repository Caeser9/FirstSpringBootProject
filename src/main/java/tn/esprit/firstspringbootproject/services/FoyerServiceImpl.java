package tn.esprit.firstspringbootproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.entities.Foyer;
import tn.esprit.firstspringbootproject.repository.IFoyerRepository;

import java.util.List;
@Service
public class FoyerServiceImpl implements IFoyer{
    @Autowired
    IFoyerRepository FoyerRepository ;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return FoyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyer(Long FoyerId) {
        return FoyerRepository.findById(FoyerId).get();
    }

    @Override
    public Foyer addFoyer(Foyer F) {
        return FoyerRepository.save(F);
    }

    @Override
    public void removeFoyer(Long FoyerId) {
        FoyerRepository.deleteById(FoyerId);
    }

    @Override
    public Foyer modifyFoyer(Foyer foyer) {
        return FoyerRepository.save(foyer);
    }



}
