package com.inheritance;

public class Hervivore extends Mammals {
	public void eat()
	{
		System.out.println("adapted to eating plant material");
		super.eat();
	}
	public void example()
	{
		System.out.println("deer,koalas");
	}
public static void main(String args[])
{
	Hervivore hr= new Hervivore();
	hr.eat();
	hr.example();
	hr.move();
	hr.division();
}
}
