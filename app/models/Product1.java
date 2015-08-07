package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Product1 extends Model {
	private long code;
	private String description;
	private float price;
	private int cantidad;
	public Product1(long codem, String descriptionm, float pricem,int cantidadm) {
		this.code = codem;
		this.description = descriptionm;
		this.price = pricem;
		this.cantidad = cantidadm;
	}
}

