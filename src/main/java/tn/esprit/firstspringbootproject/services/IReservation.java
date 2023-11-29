package tn.esprit.firstspringbootproject.services;

import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.Reservation;

import java.util.List;

public interface IReservation {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(Long ReservationId);
    public Reservation addReservation(Reservation R);
    public void removeReservation(Long reservationId);
    public Reservation modifyReservation(Reservation reservation);
    Reservation FindReservation(long idBloc);
    List<Reservation> findByAnnUniv_YearAndNomUniv(int anneeUniversitaire, String nomUniversite);
}
