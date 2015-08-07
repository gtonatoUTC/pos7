package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Temporal extends Model {
	private long code;
	private String description;
	private float price;
	private int cantidad;
	public Temporal(long codem, String descriptionm, float pricem,int cantidadm) {
		this.code = codem;
		this.description = descriptionm;
		this.price = pricem;
		this.cantidad = cantidadm;
	}
}
