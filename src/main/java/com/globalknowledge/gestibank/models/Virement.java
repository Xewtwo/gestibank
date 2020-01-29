package com.globalknowledge.gestibank.models;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "transaction")
@Data
public class Virement {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "numero_compte_debite")
    private String numeroCompteDebite;

    @Column(name = "numero_compte_credite")
    private String numeroCompteCredite;

    @Column(name = "numero_transaction")
    private int numeroTransaction;
}
