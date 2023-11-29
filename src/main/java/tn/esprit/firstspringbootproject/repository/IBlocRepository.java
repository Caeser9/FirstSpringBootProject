package tn.esprit.firstspringbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Bloc;

import java.awt.*;
import java.util.List;

@Repository
public interface IBlocRepository extends JpaRepository<Bloc, Long> {
    List<Bloc> findBlocByFoyerUniversiteIdUniversite(Long idUniversite);
}
