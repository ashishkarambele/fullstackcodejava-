package com.topcoastingdowncasting;

public class  Dog extends Animal{
	private boolean loyal;
	public Dog() {}
	public Dog (int height ,String noise,boolean loyal) {
		super(height, noise);
		this.loyal =loyal;
	}
	
	@Override
	public void printProerties() {
		System.out.println("Override Dog");
		
	
	}
	public void printProperties1() {
		System.out.println("Loyal:" +loyal);

}}
 