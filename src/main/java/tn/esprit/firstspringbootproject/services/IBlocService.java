package tn.esprit.firstspringbootproject.services;

import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.entities.ChambreType;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBlocs(Long blocId);
    public Bloc addBlocs(Bloc b);
    public void removeBlocs(Long blocId);
    public Bloc modifyBlocs(Bloc bloc);

}
