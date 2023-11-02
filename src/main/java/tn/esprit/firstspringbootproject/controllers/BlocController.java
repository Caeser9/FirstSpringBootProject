package tn.esprit.firstspringbootproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocController {
    @Autowired
    IBlocService blocService;
    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        return blocService.addBlocs(b);
    }

    @GetMapping("/retrieveAllBlocs")
    public List<Bloc> getBloc() {
        return blocService.retrieveAllBlocs();
    }

    @DeleteMapping("/DeleteBloc/{numB}")
    public void SupprimerBloc(@PathVariable("numB") Long numB) {
        blocService.removeBlocs(numB);
    }
}
