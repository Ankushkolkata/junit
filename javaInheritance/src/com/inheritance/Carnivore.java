package com.inheritance;

public class Carnivore extends Mammals {
	public void eat()
	{
		System.out.println("eats animal flesh");
		super.eat();
	}
	public void example()
	{
		System.out.println("dog,lion");
	}
	public static void main(String args[])
	{
		Carnivore cr=new Carnivore();
		cr.eat();
		cr.example();
		cr.move();
		cr.division();
	}

}
