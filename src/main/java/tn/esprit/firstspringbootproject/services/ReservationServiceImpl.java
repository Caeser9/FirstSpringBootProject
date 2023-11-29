package tn.esprit.firstspringbootproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.entities.Bloc;
import tn.esprit.firstspringbootproject.entities.Reservation;
import tn.esprit.firstspringbootproject.repository.IBlocRepository;
import tn.esprit.firstspringbootproject.repository.IReservationRepository;

import java.util.List;
@Service
public class ReservationServiceImpl implements IReservation {
    @Autowired
    IReservationRepository iReservationRepository ;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return iReservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(Long IdResevation) {
        return iReservationRepository.findById(IdResevation).get();
    }

    @Override
    public Reservation addReservation(Reservation R) {
        return iReservationRepository.save(R);
    }

    @Override
    public void removeReservation(Long reservationId) {
        iReservationRepository.deleteById(reservationId);
    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return iReservationRepository.save(reservation);
    }

    @Override
    public Reservation FindReservation(long idBloc) {
        return iReservationRepository.findForReservation(idBloc);
    }

    @Override
    public List<Reservation> findByAnnUniv_YearAndNomUniv(int anneeUniversitaire, String nomUniversite) {
        return iReservationRepository.findByAnneeUniversitaire_YearAndNomUnuiversite(anneeUniversitaire,nomUniversite);
    }
}
