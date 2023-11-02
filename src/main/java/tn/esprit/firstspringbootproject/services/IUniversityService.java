package tn.esprit.firstspringbootproject.services;

import tn.esprit.firstspringbootproject.entities.Universite;

import java.util.List;

public interface IUniversityService {
    public List<Universite> retrieveAllUniversite();
    public Universite retrieveUniversite(Long universiteId);
    public Universite addUniversite(Universite u);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite(Universite universite);
}
