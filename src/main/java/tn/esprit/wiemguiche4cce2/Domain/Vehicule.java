package tn.esprit.wiemguiche4cce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idVehicule;
     String immatricule;
     String marque;
     String modele;
     @Enumerated(value = EnumType.STRING)
     CategorieVehicule categorie;
     BigDecimal tarifJournaliser ;
    @Enumerated(value = EnumType.STRING)
    StatutVehicule statut ;
    @ManyToMany
    List<Equipement>equipements;
    @ManyToOne
    Agence agence;


}
