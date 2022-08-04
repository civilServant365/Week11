package com.promineotech.sort.model;

public class Cheese {

	private String cheeseName;
	
	public Cheese(String name) {
		this.cheeseName=name;
	}

	@Override
	public String toString() {
		return cheeseName;
	}
	
	
	public String getCheeseName() {
		return cheeseName;
	}
	
	public static int compareCheeses(Cheese c1, Cheese c2) {
		return c1.cheeseName.compareTo(c2.cheeseName);
	}
}
