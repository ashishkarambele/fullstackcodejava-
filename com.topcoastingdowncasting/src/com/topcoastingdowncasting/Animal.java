package com.topcoastingdowncasting;

public class Animal {
	private int height;
	private String noise;
	public Animal() {
		
	}
	
	public Animal(int height ,String noise) {
		this.height = height;
		this.noise = noise;
	}
	
	
	
	public void printProerties() {
		System.out.println("height: \n" + height +"noise\n"+noise);
	}

}
