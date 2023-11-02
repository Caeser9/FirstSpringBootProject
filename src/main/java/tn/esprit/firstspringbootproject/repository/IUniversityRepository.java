package tn.esprit.firstspringbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Universite;

import java.util.List;

@Repository
public interface IUniversityRepository extends JpaRepository<Universite,Long> {
}
