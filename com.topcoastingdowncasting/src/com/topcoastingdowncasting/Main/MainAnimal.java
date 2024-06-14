package com.topcoastingdowncasting.Main;

import com.topcoastingdowncasting.Animal;
import com.topcoastingdowncasting.Cat;
import com.topcoastingdowncasting.Dog;



public class MainAnimal {
	public static void main(String[] args) {
		Animal animal = new Animal (10,"chirping");
		Dog dog = new Dog(30,"Bark",true);
		Cat cat = new Cat();
		
		animal.printProerties();
		dog.printProerties();
		dog.printProperties1();
		// upcasting sub to super
		animal = dog;
		animal.printProerties();
		cat.printProerties();
		
		// downcasting super to subtype
		
	}

}
