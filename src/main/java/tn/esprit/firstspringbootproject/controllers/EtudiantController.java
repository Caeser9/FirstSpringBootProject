package tn.esprit.firstspringbootproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.Etudiant;
import tn.esprit.firstspringbootproject.services.IBlocService;
import tn.esprit.firstspringbootproject.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")

public class EtudiantController {
    @Autowired
    IEtudiantService etudiantService;
    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant (@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @GetMapping("/retrieveAllEtudiant")
    public List<Etudiant> getEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    @DeleteMapping("/DeleteEtudiant/{numE}")
    public void removeEtudiant (@PathVariable("numE") Long numE) {
        etudiantService.removeEtudiant(numE);
    }
}
