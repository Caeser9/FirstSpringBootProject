package tn.esprit.firstspringbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.entities.Reservation;
import tn.esprit.firstspringbootproject.services.IReservation;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    IReservation reservationService;

    @PostMapping("/addreservation")
    public Reservation addReservation(@RequestBody Reservation R){
        return reservationService.addReservation(R) ;
    }

    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        List<Reservation> listReservtions = reservationService.retrieveAllReservations();
        return listReservtions;
    }
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") Long RId) {
        Reservation reservation = reservationService.retrieveReservation(RId);
        return reservation;
    }
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") Long RId) {
        reservationService.removeReservation(RId);
    }
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation R) {
        Reservation reservation = reservationService.modifyReservation(R);
        return reservation;
    }

    @GetMapping("/findReservation/{idBloc}")
    public Reservation GetReservation (@PathVariable ("idBloc") Long Bid){
        return reservationService.FindReservation(Bid);
    }
    @GetMapping("/findByAnnUnivAndNomUniv/{AnnUniv}/{NomUniv}")
    public List <Reservation> GetByAnneeUniversitaire_YearAndNomUnuiversite (@PathVariable ("AnnUniv") int AnnUniv,
                                                                      @PathVariable("NomUniv") String NomUniv){
        return reservationService.findByAnnUniv_YearAndNomUniv(AnnUniv,NomUniv);
    }
}
