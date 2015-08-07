package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Cash_Payment extends Payment {
    private int change;

}
