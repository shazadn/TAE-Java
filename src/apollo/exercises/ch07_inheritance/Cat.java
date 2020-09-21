package apollo.exercises.ch07_inheritance;

public class Cat extends Animal {

	private boolean lovesCatnip = true;

	public Cat(int weight, String sex) {
		super(weight, sex);
	}
	public Cat(int weight, String sex, boolean lovesCatnip) {
		super(weight, sex);
		this.lovesCatnip = lovesCatnip;
	}
	
	public void speak() {
		  System.out.println("Meow");
		}

	public boolean getLovesCatnip() {
		return lovesCatnip;
	}

	public void setLovesCatnip(boolean lovesCatnip) {
		this.lovesCatnip = lovesCatnip;
	}

	public String toString() {

		return "Animal is a cat and it is a " + super.getSex() + ", weighing at " + super.getWeight()
				+ ". Loves catnip? " + lovesCatnip;

	}
}
