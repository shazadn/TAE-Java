package apollo.exercises.ch05_conditionals;

public class Ex2_RomanNumerals {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		// Call the method and verify it prints the correct roman numeral
		romanNumeral(0);
	}

	// Create a method that takes a number between 1-10
	// and prints the equivalent roman numeral.
	//
	// You should check to make sure the number passed
	// in isn't greater than 10. If it is, print an
	// error.
	//

	public static void romanNumeral(int number) {

		if ((number > 10) || (number < 1)) {
			System.out.println("Error: Number given is not between 1 - 10");
		
		} else {
			switch (number) {
			case 1:
				System.out.println("I");
				break;
			case 2:
				System.out.println("II");
				break;
			case 3:
				System.out.println("III");
				break;
			case 4:
				System.out.println("IV");
				break;
			case 5:
				System.out.println("V");
				break;
			case 6:
				System.out.println("VI");
				break;
			case 7:
				System.out.println("VII");
				break;
			case 8:
				System.out.println("VIII");
				break;
			case 9:
				System.out.println("IX");
				break;
			case 10:
				System.out.println("X");
				break;
			}
		}
	}

}

/*
 * SAMPLE OUTPUT:
 * 
 * II IV X
 * 
 */