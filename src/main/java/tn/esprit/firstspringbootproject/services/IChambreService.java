package tn.esprit.firstspringbootproject.services;

import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.ChamberType;
import tn.esprit.firstspringbootproject.entities.Chambre;

import java.util.List;

public interface IChambreService {
        public List<Chambre> retrieveAllChambres();
        public Chambre retrieveChambre(Long chambreId);
        public Chambre addChambre(Chambre c);
        public void removeChambre(Long chambreId);
        public Chambre modifyChambre(Chambre chambre);
        public Bloc affectBlocChambre(List<Long> idChambres, long idBloc);
        List<Chambre> findNomUniversite(String nomUniversite);
        List<Chambre> findByBlocIdBlocAndTypeChambre(long idBloc, ChamberType typeChambre);
        List<Chambre> findByBlocIdBlocAndTypeChambre2(long idBloc, ChamberType typeChambre);
}
