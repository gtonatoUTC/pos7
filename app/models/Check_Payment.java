package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class  Check_Payment extends Payment {
    private String number;

}
