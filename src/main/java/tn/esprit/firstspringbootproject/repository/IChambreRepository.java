package tn.esprit.firstspringbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Chambre;
import tn.esprit.firstspringbootproject.entities.ChambreType;

import java.util.List;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre, Long> {
    public List<Chambre> findAllByNumChambreIsNotNull();
    public List<Chambre> findByChambreType(ChambreType chambreT);

}
