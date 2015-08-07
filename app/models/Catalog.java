package models;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import play.db.jpa.Model;


@Entity
public class Catalog extends Model {

	@OneToMany(cascade = CascadeType.ALL)
	@MapKey(name = "code")
	public Map<Long, Temporal> products;

	public Catalog() {
		this.products = new HashMap<Long, Temporal>();
	}

	public Temporal findProduct(long code) {
		return null;
	}

	public void addProduct(long code, String description, float price,int cantidad) {
		Temporal product = new Temporal(code, description, price,cantidad);

		this.products.put(code, product);		
	}

}
