package com.promineotech.sorting;

import java.util.List;

import com.promineotech.sort.model.Cheese;
import com.promineotech.sort.service.SortService;
import com.promineotech.sort.service.SortType;

public class MySort {
	
	private SortService sortService = new SortService();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	new MySort().run();
	
	}

	private void run() {
		List<Cheese> cheeses = sortService.getCheeseName(SortType.LAMBDA);
		System.out.println("LAMBDA Sorting");
		print(cheeses, SortType.LAMBDA);
		System.out.println("METHOD_REFERENCE Sorting");
		print(cheeses, SortType.METHOD_REFERENCE);
		
		
	}

	
	
	private void print(List<Cheese> cheeses, SortType type) {
		switch(type) {
		case LAMBDA:
			cheeses.forEach(Cheese -> System.out.println(Cheese.getCheeseName()));
			break;
		case METHOD_REFERENCE:
			cheeses.forEach(System.out::println);
			break;
		default:
			break;
	
		}
	}
	
}
