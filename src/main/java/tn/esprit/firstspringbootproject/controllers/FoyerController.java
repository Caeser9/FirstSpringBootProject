package tn.esprit.firstspringbootproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.entities.Etudiant;
import tn.esprit.firstspringbootproject.entities.Foyer;
import tn.esprit.firstspringbootproject.services.IEtudiantService;
import tn.esprit.firstspringbootproject.services.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerController {
    @Autowired
    IFoyerService foyerService;
    @PostMapping("/addFoyer")
    public Foyer addFoyer (@RequestBody Foyer f) {
        return foyerService.addFoyer(f);
    }

    @GetMapping("/retrieveAllFoyer")
    public List<Foyer> getFoyers() {
        return foyerService.retrieveAllFoyer();
    }

    @DeleteMapping("/DeleteFoyer/{numF}")
    public void removeFoyer (@PathVariable("numF") Long numF) {
        foyerService.removeFoyer(numF);
    }
}
