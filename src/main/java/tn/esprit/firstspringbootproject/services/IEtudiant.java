package tn.esprit.firstspringbootproject.services;

import tn.esprit.firstspringbootproject.entities.Etudiant;

import java.util.List;

public interface IEtudiant {
    public List<Etudiant> retrieveAllEtudiant();
    public Etudiant retrieveEtudiant(Long etudiantId);
    public Etudiant addEtudiant(Etudiant e);
    public void removeEtudiant(Long etudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}
