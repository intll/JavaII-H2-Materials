package models;

public class Piranha extends Fish {

	// Same as const, or constexpr in C++
	final int age = 10;

	//Similar to C/C++ where static variables are created
	//first. And stays in memory and is accessible without
	//creating an object or an instance of that class first. 
	public static String name = "Default";

	public Piranha(String name) {
		//NOT this.name, since there is only ONE variable
		Piranha.name = name;
	}

	public void eat() {
		// It inherits the Fish class' implementation and variables, not Animal
		System.out.println("I eat meat under the " + super.getHabitat());

	}
}
