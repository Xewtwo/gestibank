package com.globalknowledge.gestibank.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Data
public class Adress {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "street_number")
    private int streetNumber;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "name")
    private String complement;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private int postalCode;
}


