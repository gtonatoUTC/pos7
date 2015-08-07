package controllers;

import models.Catalog;
import models.Store;
import play.mvc.Controller;
import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

	public static void index() {
		

		render();
	}
	public static void ingresarItem(long codem, String descriptionm, float pricem,int cantidadm) {
		

		
		long code = codem;
		String description= descriptionm;
		float price = pricem;
		int cantidad= cantidadm;
		Catalog catalog = new Catalog(); 
		catalog.addProduct(code,description,price,cantidad );
		catalog.save();
		render(code, description,price,cantidad);
	
	}
	
}


