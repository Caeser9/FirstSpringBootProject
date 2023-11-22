package tn.esprit.firstspringbootproject.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.repository.IBlocRepository;
import tn.esprit.firstspringbootproject.repository.IChambreRepository;

import java.util.List;
@Service
public class ChambreServiceImpl implements IChambreService{
    @Autowired
    IChambreRepository iChambreRepository ;
    @Autowired
    IBlocRepository iblocRepo;


    @Override
    public List<Chambre> retrieveAllChambres() {
        return iChambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long chambreId) {
        return iChambreRepository.findById(chambreId).get();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return iChambreRepository.save(c);
    }

    @Override
    public void removeChambre(Long chambreId) {
        iChambreRepository.deleteById(chambreId);

    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return iChambreRepository.save(chambre);
    }

    @Transactional
    @Override
    public Bloc affectBlocChambre(List<Long> idChambres, long idBloc) {
        Bloc bloc = iblocRepo.findById(idBloc).get();
        for(Long id:idChambres){
            Chambre c = iChambreRepository.findById(id).get();
            c.setBloc(bloc);
        }
        return bloc;
    }
}
