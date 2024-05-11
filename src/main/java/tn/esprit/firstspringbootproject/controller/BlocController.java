package tn.esprit.firstspringbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.services.IBloc;
import tn.esprit.firstspringbootproject.services.IChambreService;
import tn.esprit.firstspringbootproject.services.IBloc;
import tn.esprit.firstspringbootproject.services.UniversiteServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/bloc")
public class BlocController {
    @Autowired
    IBloc blocService;

    @PostMapping("/addbloc")
    public Bloc addBloc(@RequestBody Bloc b){
        return blocService.addBloc(b) ;
    }

    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBlocs();
        return listBlocs;
    }
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long bId) {
        Bloc bloc = blocService.retrieveBloc(bId);
        return bloc;
    }
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long bId) {
        blocService.removeBloc(bId);
    }
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.modifyBloc(b);
        return bloc;
    }
    @GetMapping("/blockByIdUniv/{idUniv}")
    public List<Bloc> getByIdUniv(@PathVariable ("idUniv") Long Uid) {
        return blocService.findIdUniv(Uid);
    }

}
