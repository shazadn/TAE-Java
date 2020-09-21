package apollo.exercises.ch07_inheritance;

public class Animal {
	private int weight;
	private String sex;

	public Animal(int weight, String sex) {
		this.weight = weight;
		this.sex = sex;
	}

	public void speak() {
		// Do nothing
	}

	public static void speak(Animal animal) {
		animal.speak();
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String toString() {
		return "Animal has weight of " + weight + ", the sex being " + sex;

	}
}
