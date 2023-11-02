package tn.esprit.firstspringbootproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.entities.Reservation;
import tn.esprit.firstspringbootproject.entities.Universite;
import tn.esprit.firstspringbootproject.services.IReservationService;
import tn.esprit.firstspringbootproject.services.IUniversityService;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {

        @Autowired
        IUniversityService universityService;

        @PostMapping("/addUniversite")
        public Universite addUniversite(@RequestBody Universite u) {
            return universityService.addUniversite(u);
        }

        @GetMapping("/retrieveAllUniversite")
        public List<Universite> getUniversite() {
            return universityService.retrieveAllUniversite();
        }

        @DeleteMapping("/DeleteUniversite/{numU}")
        public void SupprimerUniversite(@PathVariable("numU") Long numU) {
            universityService.removeUniversite(numU);
        }
}
