package com.ouaailelaouad.inventory_service;



import com.ouaailelaouad.inventory_service.model.Inventory;
import com.ouaailelaouad.inventory_service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication

public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("ipone_13");
			inventory.setQuantity(0);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("ipone_13_red");
			inventory1.setQuantity(100);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);

		};
	}

}
