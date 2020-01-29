package com.globalknowledge.gestibank.models;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public class User {

    @Id
    @GeneratedValue
    protected int id;

    @Column(name = "login")
    protected String login;

    @Column(name = "password")
    protected String password;

    @Column(name = "nom")
    protected String nom;

    @Column(name = "prenom")
    protected String prenom;

    @Column(name = "email")
    protected String email;

    @Column(name = "telephone")
    protected int telephone;
}
