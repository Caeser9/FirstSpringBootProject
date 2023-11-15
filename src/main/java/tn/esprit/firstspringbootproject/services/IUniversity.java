package tn.esprit.firstspringbootproject.services;

import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.entities.Foyer;
import tn.esprit.firstspringbootproject.entities.Reservation;
import tn.esprit.firstspringbootproject.entities.Universite;

import java.util.List;

public interface IUniversity {
    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long UniversiteId);
    public Universite addUniversite(Universite U);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite(Universite universite);
    public Universite affectFoyerUniversite(long idFoyer , long idUniversite);
    public Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;
}
