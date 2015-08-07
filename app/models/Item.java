package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Item extends Model {
    private Integer quantity;
    private int subtotal;
    private int tax;

}
