package tn.esprit.firstspringbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.Foyer;
import tn.esprit.firstspringbootproject.entities.Universite;
import tn.esprit.firstspringbootproject.services.IUniversity;
import tn.esprit.firstspringbootproject.services.UniversiteServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversityController {
    @Autowired
    IUniversity UniversityService ;

    @PostMapping("/adduniversite")
    public Universite addUniversite(@RequestBody Universite U){
        return UniversityService.addUniversite(U) ;
    }

    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        return UniversityService.retrieveAllUniversites();
    }

    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveReservation(@PathVariable("universite-id") Long UId) {
        return UniversityService.retrieveUniversite(UId);
    }
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long UId) {
        UniversityService.removeUniversite(UId);
    }
    @PutMapping("/modify-universite")
    public Universite modifyReservation(@RequestBody Universite U) {
        return UniversityService.modifyUniversite(U);
    }

    @PostMapping("/affect-foyer-universite/{Foyer-id}/{universite-id}")
    public Foyer affectFoyerUniversite(@PathVariable("Foyer-id") Long Fid,
                                       @PathVariable("universite-id") Long Uid) {
        return UniversityService.affectFoyerUniversite(Fid, Uid);
    }

    @PostMapping("/ajouter-effectuerFoyerUniversite/{universite-id}")
    public Foyer ajouterFoyerEtAffecterAUniversite( @RequestBody Foyer f,
                                                    @PathVariable("universite-id") Long Uid){
        return  UniversityService.ajouterFoyerEtAffecterAUniversite(f,Uid);
    }


}
