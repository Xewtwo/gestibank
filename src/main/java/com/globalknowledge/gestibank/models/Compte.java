package com.globalknowledge.gestibank.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "compte")
@Data
public class Compte {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "solde")
    private Float solde;

    @Column(name = "id_client")
    private int idClient;

    @Column(name = "creating_date")
    private Date creatingDate;

    @Column(name = "rib")
    private String rib;

    @Column(name = "taux_remu")
    private Float tauxRemu;

    @Column(name = "compte_type")
    private String compteType;

    @Column(name = "seuil_mini_remu")
    private Float seuilMiniRemu;

    @Column(name = "taux_agio")
    private Float tauxAgio;

    @Column(name = "autorisation_decouvert")
    private boolean autorisationDecouvert;

    @Column(name = "plafond_decouvert")
    private Float plafondDecouvert;
}
