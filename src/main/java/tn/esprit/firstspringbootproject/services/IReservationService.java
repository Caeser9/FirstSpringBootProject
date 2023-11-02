package tn.esprit.firstspringbootproject.services;

import tn.esprit.firstspringbootproject.entities.Reservation;
import tn.esprit.firstspringbootproject.entities.Universite;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservation();
    public Reservation retrieveReservation(Long reservationId);
    public Reservation addReservation(Reservation r);
    public void removeReservation(Long reservationId);
    public Reservation modifyReservation(Reservation reservation);
}
