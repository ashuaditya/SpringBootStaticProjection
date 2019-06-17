package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		  // Bulk Insert 
				/*List<Product> pds = Arrays.asList( 
						new Product(10, "G", 7.1, "MDL1", "VEN101"),
						new Product(11, "H", 8.1, "MDL2", "VEN102"), 
						new Product(12, "I", 9.1, "MDL3", "VEN103"), 
						new Product(13, "J", 1.1, "MDL4", "VEN104"), 
						new Product(14, "K", 2.1, "MDL5", "VEN105"), 
						new Product(15, "L", 3.1, "MDL6", "VEN106")
				  
				  ); 
				repo.saveAll(pds);
				System.out.println("Done");*/
		repo.findByProdCost(3.1).forEach(p->System.out.println(p.getProdCode() + ", " +p.getProdModel()));
		repo.findByProdCode("k").forEach(p->System.out.println(p.getProdCost() + ", " +p.getProdVendor()));
	}

}
