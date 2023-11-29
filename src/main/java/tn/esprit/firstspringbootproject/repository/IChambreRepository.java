package tn.esprit.firstspringbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.ChamberType;
import tn.esprit.firstspringbootproject.entities.Chambre;

import java.util.List;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findChambreByBlocFoyerUniversiteNomUniversite(String nomUniversite);
    @Query("select c from Chambre c where c.typeC=:typeChambre and c.bloc.idBloc=:idBloc")
    List<Chambre> findByBlocIdBlocAndTypeChambreJPQL(@Param("idBloc") long idBloc, ChamberType typeChambre);
    List<Chambre> findChambreByBlocIdBlocAndTypeC(Long idBloc, ChamberType typechambre);
}
