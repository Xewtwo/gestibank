package com.globalknowledge.gestibank.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client extends User {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(targetEntity = Agent.class)
    private Agent agent;

    @OneToMany(targetEntity = Demande.class)
    private Set<Demande> demandes;

}
