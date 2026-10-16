package tn.esprit.wiemguiche4cce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idAgence;
    String ville;
    String nom;
    String adresse;
    String telephone;

    @OneToMany(mappedBy = "agence")
    List<Vehicule> vehicules;
    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    List<Employe> employes;
}