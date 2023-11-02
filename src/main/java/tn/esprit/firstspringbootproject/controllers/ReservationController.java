package tn.esprit.firstspringbootproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.entities.Reservation;
import tn.esprit.firstspringbootproject.services.IChambreService;
import tn.esprit.firstspringbootproject.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    IReservationService reservationService;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation c) {
        return reservationService.addReservation(c);
    }

    @GetMapping("/retrieveAllReservation")
    public List<Reservation> getReservations() {
        return reservationService.retrieveAllReservation();
    }

    @DeleteMapping("/DeleteReservation/{numR}")
    public void SupprimerReservation(@PathVariable("numR") Long numR) {
        reservationService.removeReservation(numR);
    }
}
