package com.inheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MammalsTest {

	@Test
	void test() {
		Animal an=new Mammals();
		String output=an.eat();
		assertEquals("animal is eating",output);
		String o=an.move();
		assertEquals("animal is moving",o);
		Carnivore cr=new Carnivore();
		String e=cr.eat();
		assertEquals("eats animal flesh",e);
		Animal koyel=new Bird();
		String s= koyel.eat();
		
	}

}
