package com.inheritance;

public class Bird extends Animal{
	public void sing()
	{
		System.out.println("bird is singing");
	}
	public static void main(String args[])
	{
		Bird b=new Bird();
		b.sing();
		b.move();
	}

}
