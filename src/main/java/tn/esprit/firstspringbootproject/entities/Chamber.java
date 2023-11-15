package tn.esprit.firstspringbootproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chamber implements Serializable {
    @Id
    private long idChambre ;
    private int numchambres ;
    @Enumerated(EnumType.STRING)
    private ChamberType chambretype ;

    @OneToMany (cascade = CascadeType.ALL)
    private List<Reservation> reservations ;
    @ManyToOne
    private Bloc bloc;


}
