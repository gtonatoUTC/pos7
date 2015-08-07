package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import play.db.jpa.Model;

@Entity
public class Sale extends Model {
	private int number;
	private Date date;
	private Boolean complete;
	private float subtotal;
	private float taxes;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Item> items;
	@OneToOne(cascade = CascadeType.ALL)
	private Payment payment;

	public Sale() {
		this.complete = false;
		this.items = new ArrayList<Item>();
		this.payment = null;
	}

	public void makeItem(Temporal p, int qty) {
	}

	public void becomeComplete() {
	}

	public float calculateTotal() {
		float aux = 3;

		return aux;
	}

	public float makeCashPayment(float amount) {
		float aux = 3;

		return aux;
	}

	public void makeCheckPayment(String number) {
	}

	public void record(String cashier, String register) {
	}

	public void decreaseStock() {
	}

}

