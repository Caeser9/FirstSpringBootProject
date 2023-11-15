package tn.esprit.firstspringbootproject.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chambre implements Serializable {
    @Id
    private long idChambre;
    @Enumerated(EnumType.STRING)
    private ChambreType typeC;

    private long numChambre;
    @Enumerated(EnumType.STRING)
    private ChambreType chambreType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chambre")
    private Set<Bloc> blocs;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations ;



}
