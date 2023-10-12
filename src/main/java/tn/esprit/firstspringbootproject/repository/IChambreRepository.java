package tn.esprit.firstspringbootproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Chambre;

@Repository
public interface IChambreRepository extends CrudRepository <Chambre, Long> {

}
