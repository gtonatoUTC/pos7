package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Register extends Model {
	private String register;
	private String cashier;

	private Store store;
	private Catalog catalog;
	private Sale currentSale;

	public Register(String register, String cashier, Store store,
			Catalog catalog) {
		this.cashier = cashier;
		this.register = register;
		this.store = store;
		this.catalog = catalog;
		this.currentSale = null;
	}

	public void makeNewSale() {
		this.currentSale = new Sale();
	}

	public void enterItem(int code, int qty) {
		Temporal p= this.catalog.findProduct(code);
		this.currentSale.makeItem(p, qty);
	}

	public float endSale() {
		float aux = 3;

		return aux;
	}

	public float makeCashPayment(float amount) {
		float aux = 3;

		return aux;
	}

	public void makeCheckPayment(String number) {
	}

}
