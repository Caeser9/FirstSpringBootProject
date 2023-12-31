package tn.esprit.firstspringbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.ChamberType;
import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.repository.IBlocRepository;
import tn.esprit.firstspringbootproject.services.IBloc;
import tn.esprit.firstspringbootproject.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {
    @Autowired
    IChambreService chambreService;

    @PostMapping("/addchambre")
    public Chambre addChambre(@RequestBody Chambre c){
        return chambreService.addChambre(c) ;
    }

    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.retrieveAllChambres();
        return listChambres;
    }
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Chambre chambre = chambreService.retrieveChambre(chId);
        return chambre;
    }
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.modifyChambre(c);
        return chambre;
    }

    @PostMapping("/affectBlocChambre/{id-bloc}")
    public Bloc affectBlocChambre(@RequestBody List<Long> idChambres,
                                  @PathVariable("id-bloc") Long idB ){
        return chambreService.affectBlocChambre(idChambres,idB);
    }

    @GetMapping("/getChbrByNomUniv/{nomUniv}")
    public List<Chambre> getByNomUniv(@PathVariable("nomUniv") String NomUniv){
        return chambreService.findNomUniversite(NomUniv);
    }
    @GetMapping("/getByIdBlocAndTypeC/{idBloc}/{typeC}")
    public List<Chambre> getByIdBlocAndtypeC(@PathVariable("idBloc") Long Bid,
                                             @PathVariable("typeC")ChamberType Tc){
        return chambreService.findByBlocIdBlocAndTypeChambre(Bid,Tc);
    }
    @GetMapping("/getByIdBlocAndTypeC2/{idBloc}/{typeC}")
    public List<Chambre> getByIdBlocAndtypeC2(@PathVariable("idBloc") Long Bid,
                                             @PathVariable("typeC")ChamberType Tc){
        return chambreService.findByBlocIdBlocAndTypeChambre2(Bid,Tc);
    }
    @PostMapping("/addchambreWithResAndEtud")
    public Chambre addChambreAndResAndEtud(@RequestBody Chambre c){
        return chambreService.affectChambreAndReservationAndEtudiant(c) ;
    }


}
