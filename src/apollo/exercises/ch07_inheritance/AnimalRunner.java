package apollo.exercises.ch07_inheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal fox = new Animal(57, "Female");
		System.out.println(fox.toString());

		Dog dog = new Dog(85, "Male", false);
		System.out.println(dog.toString());
		dog.speak();

		Cat cat = new Cat(43, "Female", true);
		System.out.println(cat.toString());
		cat.speak();
		
		System.out.println("///////////////////");
		//Overriding
		Animal.speak(cat);
		Animal.speak(dog);
		System.out.println("///////////////////");
		//Overloading
		Dog dog1 = new Dog(49, "Female");
		System.out.println(dog1.toString());
		Dog dog2 = new Dog(69, "Male", true);
		System.out.println(dog2.toString());
		
		Cat cat1 = new Cat(24, "Male");
		System.out.println(cat1.toString());
		Cat cat2 = new Cat(36, "Female", false);
		System.out.println(cat2.toString());
		
		dog.speak(1);
		dog.speak(3);
		
		
		
		
	}

}
