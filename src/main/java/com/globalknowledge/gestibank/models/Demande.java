package com.globalknowledge.gestibank.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "demande")
@Data
public class Demande {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(targetEntity = Client.class)
    private Client client;

    @Column(name = "date_creation")
    private Date dateCreation;

    @Column(name = "id_justificatif")
    private int idJustificatif;

    @Column(name = "id_notification")
    private int idNotification;
}
