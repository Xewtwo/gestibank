package com.globalknowledge.gestibank.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notification")
@Data
public class Notification {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "message")
    private String message;

    @Column(name = "date_notification")
    private Date dateNotification;
}
