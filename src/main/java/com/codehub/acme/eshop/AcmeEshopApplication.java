package com.codehub.acme.eshop;

import com.codehub.acme.eshop.service.OrderService;
import com.codehub.acme.eshop.service.ProductService;
import com.codehub.acme.eshop.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcmeEshopApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	@Autowired
	private ProductServiceImpl productService;

	public static void main(String[] args) {
		SpringApplication.run(AcmeEshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//orderService.submitOrder();
		//productService.save();
	}
}