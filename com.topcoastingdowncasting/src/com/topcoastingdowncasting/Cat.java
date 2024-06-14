package com.topcoastingdowncasting;


public class Cat extends Animal{
	private boolean loyal;
	public Cat() {}
	public Cat(int height,String noise,boolean loyal) {
		super(height , noise);
		this.loyal=loyal;
	}
	public void printProerties() {
		System.out.println("Override cat");
	}
	
	public void printProperties1() {
		System.out.println("Loyal:" +loyal);


}}
