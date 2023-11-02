package tn.esprit.firstspringbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Etudiant;

@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Long> {

}
