package tn.esprit.firstspringbootproject.services;

import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.ChamberType;
import tn.esprit.firstspringbootproject.entities.Chambre;

import java.util.List;

public interface IBloc {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long blocId);
    public Bloc addBloc(Bloc c);
    public void removeBloc(Long blocId);
    public Bloc modifyBloc(Bloc bloc);
    public List<Chambre> getChambresParBlocEtType (long idBloc, ChamberType typeC) ;

}
