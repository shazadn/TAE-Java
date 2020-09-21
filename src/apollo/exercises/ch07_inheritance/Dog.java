package apollo.exercises.ch07_inheritance;

public class Dog extends Animal {
	private boolean isGuideDog = false;

	public Dog(int weight, String sex) {
		super(weight, sex);
	}

	public Dog(int weight, String sex, boolean isGuideDog) {
		super(weight, sex);
		this.isGuideDog = isGuideDog;
	}

	public void speak() {
		System.out.println("Woof");
	}

	public void speak(int numTimes) {
		for (int i = 0; i < numTimes; i++) {
			System.out.println("Woof");
		}

	}

	public boolean getGuideDog() {
		return isGuideDog;
	}

	public void setGuideDog(boolean guideDog) {
		this.isGuideDog = guideDog;
	}

	public String toString() {

		return "Animal is a dog and it is a " + super.getSex() + ", weighing at " + super.getWeight() + ". Guidedog? "
				+ isGuideDog;

	}
}
