package models;

public class Bird extends Animal {

	public Bird() {
		super("Sky");
	}
	
	
	@Override
	public void move() {
		System.out.println("Flap Flap!");
		System.out.println("I fly among the clouds!");
		System.out.println();
	}

}
