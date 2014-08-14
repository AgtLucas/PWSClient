package uk.com.megabrew.service.client;

import java.util.List;

import uk.com.megabrew.service.ListBeers;
import uk.com.megabrew.service.ListBeersService;
import uk.com.megabrew.service.Product;

public class Client {
	
	public static void main(String[] args) {
		
		ListBeersService service = new ListBeersService();
		ListBeers client = service.getListBeersPort();
		
		List<Product> products = client.listBeers();
		
		for (Product product : products) {
			System.out.println("Name: " + product.getName());
			System.out.println("Amout: " + product.getAmount());
			System.out.println("Unit Measure: " + product.getUnitMeasure());
			System.out.println("Volume: " + product.getVolume());
			System.out.println("Price: " + product.getPrice());
			System.out.println("");
		}
		
	}

}
