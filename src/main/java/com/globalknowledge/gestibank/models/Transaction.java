package com.globalknowledge.gestibank.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction")
@Data
public class Transaction {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "numero_compte")
    private int numeroCompte;

    @Column(name = "numero_transaction")
    private int numeroTransaction;

    @Column(name = "date_emission")
    private Date dateEmission;

    @Column(name = "type_transaction")
    private String typeTransaction;

    @Column(name = "id_notification")
    private int idNotification;
}
