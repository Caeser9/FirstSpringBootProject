package tn.esprit.firstspringbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Foyer;

import java.util.List;

@Repository
public interface IFoyerRepository extends JpaRepository<Foyer, Long> {
    public List<Foyer> findByCapaciteFoyerBetween(Long CapFoyer);
    public List<Foyer> getFoyerByNomFoyer(Long GetNomFoyer);

}
