package apollo.exercises.ch06_classes;

public class Ex1_BookRunner {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {

		String title = "Harry Potter";
		User jKRowling = new User();
		jKRowling.setName("Joanne Rowling");
		jKRowling.setAge(55);
		jKRowling.setLocation("Edinburgh");
		int numPages = 1450;
		int isbn = 34923758;
		
		
//		String title2 = "Twilight";
//		String author2 = "Stephenie Meyer";
//		int numPages2 = 1210;
//		int isbn2 = 4653634;
		
		Book book = new Book(title, jKRowling, numPages, isbn);
//		Book book2 = new Book(title2, author2, numPages2, isbn2);

		System.out.println(book.toString());
//		System.out.println(book2.toString());
		
		jKRowling.readBook(book);
	}

}
