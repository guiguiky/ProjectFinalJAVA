package com.efrei.jpa.entity;



import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date beginRent;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date endRent;

    @ManyToOne
    @NonNull
    private Vehicule vehicule;

    @ManyToOne
    @NonNull
    private Person person;

    public Rent() {
    }

    public Rent(Date beginRent, Date endRent, Person person, Vehicule vehicule) {
        this.beginRent = beginRent;
        this.endRent = endRent;
        this.person = person;
        this.vehicule = vehicule;
    }

    public Long getId() {
        return id;
    }

    public Date getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicle(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
    
}