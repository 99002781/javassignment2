package com.lts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.foodwiring.FoodPanda;

@SpringBootApplication
public class TrialOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TrialOneApplication.class, args);
	}
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		FoodPanda foodpanda=context.getBean(FoodPanda.class);
		List<String> menuList = foodpanda.showMenu("Chinese");
		for(String iterator: menuList )
			System.out.println(iterator);


	}
}
