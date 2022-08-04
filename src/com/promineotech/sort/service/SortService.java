package com.promineotech.sort.service;

import java.util.Comparator;
import java.util.List;

import com.promineotech.sort.dao.SortDao;
import com.promineotech.sort.model.Cheese;

public class SortService {

	private SortDao sortDao = new SortDao();
	
	public List<Cheese> getCheeseName(SortType type){
		List<Cheese> cheeses = sortDao.getCheeseName();
		Comparator<Cheese> comp = null;
		
		switch(type) {
		case LAMBDA:
			comp = (Cheese c1, Cheese c2) -> {
				return Cheese.compareCheeses(c1, c2);
			};
			break;
		case METHOD_REFERENCE:
			comp = Cheese::compareCheeses;
			break;
		default:
			throw new RuntimeException("Unhandled sort type: " + type);
			
		
		}
		
		
		
		
		
		
		
		
		cheeses.sort(comp);
		return cheeses;
	}
}
