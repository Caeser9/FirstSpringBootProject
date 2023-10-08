package tn.esprit.firstspringbootproject.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bloc implements Serializable {
    @Id
    private long idBloc;

    private String nomBloc;

    private long capaciteBloc;
    @ManyToOne
    Foyer foyer ;
    @ManyToOne
    Chambre chambre;



}
