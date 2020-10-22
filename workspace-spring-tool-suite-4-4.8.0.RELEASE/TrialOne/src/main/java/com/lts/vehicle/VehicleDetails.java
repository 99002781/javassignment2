package com.lts.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class VehicleDetails {

@Autowired
@Qualifier("car")
MileCalculator mc;
@Autowired
@Qualifier("bike")
MileCalculator mb;
public String getMileage(String choice) {
	if(choice.equals("Car")){
		return mc.showMileage();
	}
	else if(choice.equals("Bike")) {
		  return mb.showMileage();
	}
	return null;
}
}
