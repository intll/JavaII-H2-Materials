package main;

import models.Bird;
import models.Dog;
import models.Fish;
import models.Piranha;

public class Main {
	
	public Main()
	{
		Fish fish = new Fish();
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		fish.printHabitat();
		dog.printHabitat();
		bird.printHabitat();
		
		System.out.println();
		
		fish.move();
		dog.move();
		bird.move();
//		
		System.out.println(Piranha.name);
		Piranha piranha = new Piranha("Jason");
		System.out.println(Piranha.name);
		//Understand that piranha.name is actually Piranha.name
		//All objects share the same variable
		System.out.println(piranha.name);
		Piranha.name = "Test";
		System.out.println(piranha.name);
	}

	public static void main(String[] args) {
//		JavaII H2
//		Concepts:
//		
//		Inheritance Definition and Declaration
//			Inheritance:		A concept where a subclass inherits the
//						 		attributes and methods of its superclass.
//			Access Modifiers:	Public -> Protected -> Default -> Private
//								Any		  Pack+Subc   Pack       None
//		
//		Inheritance Implementation
//			Implementation:		Use the 'extends' keyword to create a subclass.
//			
//		Single vs Multiple Inheritance
//			Diamond Problem:	Java does not support multiple inheritance. C++ does
//								due to its :: scope operator.
								
								
//		Superclass and Subclass
//			Superclass: The parent class
//			Subclass:	The class inheriting from a parent class
//		
//		Final Keyword
//			For a class: The final keyword makes such that the class cannot be extended
//			For a variable: The final keyword makes such that it cannot be changed
//			For a function: The final keyword makes such that it cannot be overridden
			
//		Super Keyword
//			Super Definition:	Accesses the parent class' methods
//		
//		Static Keyword
//			Static Definition: Basically makes that variable only one and accessible 
//							   in a global scope.
//		
//		Composition and Aggregation
//			Definition: Class relationships, (has a, belongs to, etc.)
			
		new Main();
	}
}

//Notes:
//Shortcut for creating classes/packages/etc. -> Shift - Alt - N
//Shortcut for creating getters/setter -> Shift - Alt - S - R
//Shortcut for creating constructors -> Shift - Alt - S - O
//Shortcut for cleaning up format -> Control - Shift - F
