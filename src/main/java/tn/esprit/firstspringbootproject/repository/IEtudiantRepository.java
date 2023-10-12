package tn.esprit.firstspringbootproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Etudiant;

@Repository
public interface IEtudiantRepository extends CrudRepository <Etudiant, Long> {

}
