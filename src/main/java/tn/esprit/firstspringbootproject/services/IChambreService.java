package tn.esprit.firstspringbootproject.services;


import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.entities.ChambreType;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
    public Bloc affectBlocChambre(List <Long> idChambre, long idBloc);
    public List<Chambre> getChambresParBlocEtType (long idBloc, ChambreType typeC) ;
}
