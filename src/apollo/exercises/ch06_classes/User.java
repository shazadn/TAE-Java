package apollo.exercises.ch06_classes;

public class User {
	private String name;
	private int age;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void readBook(Book book) {
		System.out.println(this.name + ", " + this.age + ", " + this.location + " read " + book.getTitle());
	}

	public String toString() {
		return "The details of the User are: " + name + ", " + age + ", " + location;
	}

}
