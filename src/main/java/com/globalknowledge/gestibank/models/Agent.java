package com.globalknowledge.gestibank.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "agent")
@Data
@EqualsAndHashCode(callSuper = false)
public class Agent extends User {

    @Column(name = "id_notification")
    private int idNotification;

    @OneToMany(targetEntity = Client.class)
    private Set<Client> clients;
}
