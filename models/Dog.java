package models;

public class Dog extends Animal {

	public Dog() {
		//Calls the default constructor inherited from its superclass
		super("Land");
	}
	
	@Override
	public void move() {
		System.out.println("Woof!");
		System.out.println("I run across the land!");
		System.out.println();
	}
	
}
