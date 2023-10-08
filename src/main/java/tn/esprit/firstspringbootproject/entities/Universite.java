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
public class Universite implements Serializable {
    @Id
    private long idUnivsercite;

    private String nomUniversite;

    private String adress;

    @OneToOne
    private Foyer foyer ;





}
