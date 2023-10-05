package tn.esprit.firstspringbootproject.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable {
    @Id
    private long idReservation;

    private Date anneUniversitaire;

    private boolean estValide;



}
