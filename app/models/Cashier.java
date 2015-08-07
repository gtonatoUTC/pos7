package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Cashier extends Model {
    private String name;

}
