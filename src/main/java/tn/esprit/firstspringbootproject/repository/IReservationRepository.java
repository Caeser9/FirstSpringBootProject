package tn.esprit.firstspringbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Reservation;

import java.util.Date;
import java.util.List;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation,Long> {

    public List<Reservation> findReservationByAnneUniversitaire(Date ByAnneUniv);
    public List<Reservation> findByIdReservation(Long IdReserv);
}
