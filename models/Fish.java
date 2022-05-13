package models;

public class Fish extends Animal{

	public Fish() {
		super("Sea");
	}

	//Overrides the superclass' definition of move() 
	//with its own. This is called function overriding.
	//Without it, it inherits the superclass' implementation of move()
	@Override
	public void move() {
		System.out.println("Blub Blub Blub!");
		System.out.println("I swim under the sea!");
		System.out.println();
	}
}
