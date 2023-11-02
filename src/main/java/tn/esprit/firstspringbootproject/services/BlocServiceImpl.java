package tn.esprit.firstspringbootproject.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.repository.IBlocRepository;
import tn.esprit.firstspringbootproject.services.IBlocService;

import java.util.List;

@Service
public class BlocServiceImpl implements IBlocService {
    @Autowired
    IBlocRepository iBlocRepository;


    public BlocServiceImpl(IBlocRepository iBlocRepository) {
        this.iBlocRepository = iBlocRepository;
    }

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return iBlocRepository.findAll();
    }

    @Override
    public Bloc retrieveBlocs(Long blocId) {
        return iBlocRepository.findById(blocId).orElse(null);
    }

    @Override
    public Bloc addBlocs(Bloc b) {
        return iBlocRepository.save(b);
    }

    @Override
    public void removeBlocs(Long blocId) {
        iBlocRepository.deleteById(blocId);
    }

    @Override
    public Bloc modifyBlocs(Bloc bloc) {
        return iBlocRepository.save(bloc);
    }
}
