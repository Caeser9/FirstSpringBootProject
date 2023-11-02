package tn.esprit.firstspringbootproject.services;

import tn.esprit.firstspringbootproject.entities.Etudiant;
import tn.esprit.firstspringbootproject.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyer();
    public Foyer retrieveFoyer(Long foyerId);
    public Foyer addFoyer(Foyer f);
    public void removeFoyer(Long foyerId);
    public Foyer modifyEtudiant(Foyer foyer);
}
