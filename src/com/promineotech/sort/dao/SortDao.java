package com.promineotech.sort.dao;

import java.util.ArrayList;
import java.util.List;

import com.promineotech.sort.model.Cheese;

public class SortDao {

	List<Cheese> cheeses = new ArrayList<Cheese>(List.of( new Cheese("Harvati"), 
			new Cheese ("Swiss"), new Cheese ("Cheddar"),
			new Cheese ("Provolone")));
	

public List<Cheese> getCheeseName() {
	return cheeses;
}
}
