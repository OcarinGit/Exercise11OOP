package com.exercise11oop.app;

import com.exercise11oop.model.Dog;

public class PerroApp 
{

	public static void main(String[] args) 
	{	
		//Way 1
		Dog pluto;
		pluto = new Dog();
		
		System.out.println("Pluto's age:"+pluto.age);
		System.out.println("Pluto's height:"+pluto.height);
		System.out.println("PLuto's "+pluto.id);
		
		pluto.age = 15;
		pluto.height = 50;
		pluto.id = 10;
		
		System.out.println("Pluto's age:"+pluto.age);
		System.out.println("Pluto's height:"+pluto.height);
		System.out.println("PLuto's "+pluto.id);
		
		Dog firulais = new Dog(1, "Firulais", "Labrador",5,60.0);
		
		System.out.println("Firulais age:"+firulais.age);
		System.out.println("Firulais height:"+firulais.height);
		System.out.println("Firulais id:"+firulais.id);
		
		Dog lucho = new Dog(1, "Lucho");
	}
}
