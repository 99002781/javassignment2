package com.lts.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator{

	@Override
	public String showMileage() {
		// TODO Auto-generated method stub
		System.out.println("car mileage is...");
		return null;
	
	}
	

}
