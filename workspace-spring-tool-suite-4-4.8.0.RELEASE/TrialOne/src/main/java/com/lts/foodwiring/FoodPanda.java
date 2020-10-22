package com.lts.foodwiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class FoodPanda{
	@Autowired
	@Qualifier("indian")
	Menu imenu;
	
	@Autowired
	@Qualifier("chinese")
	Menu cmenu;
	public List<String> showMenu(String choice) {
		if(choice.equals("Indian")) {
			//return imenu.itemsAvailable();	
			
			
		}
		
		else if(choice.equals("Chinese")) {
			return cmenu.itemsAvailable();
		}
		//imenu.itemsAvailable();
		//cmenu.itemsAvailable();
		
		return null;
	}

		
	}

