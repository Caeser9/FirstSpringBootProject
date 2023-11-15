package tn.esprit.firstspringbootproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.entities.ChambreType;
import tn.esprit.firstspringbootproject.repository.IBlocRepository;
import tn.esprit.firstspringbootproject.repository.IChambreRepository;

import java.util.List;
import java.util.Set;

@Service

public class ChambreServiceImpl implements IChambreService {
    @Autowired
    IChambreRepository iChambreRepository;
    @Autowired
    IBlocRepository iBlocRepository;
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

        return iChambreRepository.save(chambre) ;
    }

    @Override
    public Bloc affectBlocChambre(List<Long> idChambre, long idBloc) {
        Bloc bloc = iBlocRepository.findById(idBloc).get();
        for (Long id:idChambre){
            Chambre c = iChambreRepository.findById(id).get();
            c.setBlocs((Set<Bloc>) bloc);
        }
        return bloc;
    }
    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, ChambreType typeC) {
        Bloc b = iBlocRepository.findById(idBloc).get();
        List<Chambre> chambres = b.getChambre() ;

        for (int i=1; i<b.getChambre().){

        }
    }
}
