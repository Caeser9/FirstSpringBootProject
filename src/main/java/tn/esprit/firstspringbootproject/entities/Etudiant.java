package tn.esprit.firstspringbootproject.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant implements Serializable {
    @Id
    private long idEtudiant;

    private String nomEt;

    private String prenomEt;

    private long cin ;

    private String ecole;

    private Date dateNaissance;



}
