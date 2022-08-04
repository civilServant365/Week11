package com.promineotech.optional;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

public class Week11Part3 {
	
	
	
	public static void main (String[] args) {
		Optional<Cheese> optionalCheese =
				Optional.empty();
		Optional<Cheese> cheeseNameTest = Optional.of(new Cheese ("Mozzarrella"));
		
	//cheesyMethod1(optionalCheese);
	//System.out.println(cheesyMethod1(cheeseNameTest).getName() + " Method 1");
	//printCheeseMethod2(optionalCheese);
	printCheeseMethod2(cheeseNameTest);
	
	
	}
	

	public static Cheese cheesyMethod1 
	(Optional<Cheese> optionalCheese) {
		return optionalCheese.orElseThrow(
				()-> new NoSuchElementException
				("No Optional Present. "));
	
	}
	
	public static void printCheeseMethod2 
	(Optional<Cheese> optionalCheese) {
		try {
			System.out.println(cheesyMethod1
					(optionalCheese).getName() + " Method 2.");
		}
		catch (NoSuchElementException error) {
			System.out.println(error.getMessage(
					) + "Error. Method 2");
		}
	}
	}

	

