package com.exercise11oop.model;

public class Angora extends Cat {
	//Properties
	private double mouthLong;
	
	//Constructors
	public Angora()
	{
	}
	public Angora(int id, String name, int age)
	{
		super(id, name, age);
	}
	public Angora(int id, String name, int age, double mouthLong)
	{
		super(id, name, age);
		this.mouthLong = mouthLong;
	}
	//Getters y setters
	public double getMouthLong()
	{
		return mouthLong;
	}
	public void setMouthLong(double mouthLong)
	{
		this.mouthLong = mouthLong;
	}
	
	//ToString method specific to Angora Class
	@Override
	public String ToString()
	{
		return "Id:["+getId()+"], name:["+getName()+"], age:["+getAge()+"], mouthLongitude:["+mouthLong+"]";
	}
	@Override
	public void Meow() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Scratch() {
		// TODO Auto-generated method stub
		
	}
}
