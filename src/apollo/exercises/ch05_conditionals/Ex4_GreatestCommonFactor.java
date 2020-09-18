package apollo.exercises.ch05_conditionals;

public class Ex4_GreatestCommonFactor {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		// Call the greatestCommonFactor method a few times and print the results
		greatestCommonFactor(6, 4);
		greatestCommonFactor(7, 9);
		greatestCommonFactor(20, 30);
		greatestCommonFactor(120, 50);
	}

	// Create a method called greatestCommonFactor
	// It should return the greatest common factor
	// between two numbers.
	//
	// Examples of greatestCommonFactor:
	// greatestCommonFactor(6, 4) // returns 2
	// greatestCommonFactor(7, 9) // returns 1
	// greatestCommonFactor(20, 30) // returns 10
	//
	// Hint: start a counter from 1 and try to divide both
	// numbers by the counter. If the remainder of both divisions
	// is 0, then the counter is a common factor. Continue incrementing
	// the counter to find the greatest common factor. Use a while loop
	// to increment the counter.

	public static void greatestCommonFactor(int num1, int num2) {

		int count=1;
		int factor=1;
		while (count <= num1 && count <= num2) {
			//int count = 1;
			if (((num1 % count) == 0)&&((num2 % count) == 0)) {
				factor = count;			
			}
			count++;
		}
		int greatComFact = factor;
		System.out.println(greatComFact);
	}

}

/*
 * SAMPLE OUTPUT:
 * 
 * 2 1 0
 * 
 */