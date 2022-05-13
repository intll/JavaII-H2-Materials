package models;

public class Animal {
	private String habitat;

	public Animal(String habitat) {
		super();
		this.habitat = habitat;
	}

	public void printHabitat() {
		System.out.println("My habitat: " + this.habitat);
	}

	public void move() {
		System.out.println("[!] Default Move");
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

}
