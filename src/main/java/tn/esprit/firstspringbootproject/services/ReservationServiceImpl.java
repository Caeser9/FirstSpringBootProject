package tn.esprit.firstspringbootproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.entities.Reservation;
import tn.esprit.firstspringbootproject.repository.IReservationRepository;

import java.util.List;
@Service
public class ReservationServiceImpl implements IReservationService{
    @Autowired
    IReservationRepository iReservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return iReservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(Long reservationId) {
        return iReservationRepository.findById(reservationId).get();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return iReservationRepository.save(r);
    }

    @Override
    public void removeReservation(Long reservationId) {
        iReservationRepository.deleteById(reservationId);
    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return iReservationRepository.save(reservation);
    }
}
