package apollo.exercises.ch08_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex2_Generics {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {

		// Directions:
		//
		// 1) Initialize an ArrayList of Strings to 5 strings using:
		// new ArrayList<String>(Arrays.asList("hello", "goodbye"));
		//
		// 2) Try to add an integer to that ArrayList using something like:
		// array.add(5);
		//
		// Note what the compile error says.
		//
		// 3) Create another ArrayList of Integers.
		// 4) Add 10 random integers to the ArrayList using the add method
		// 5) Print out the contents of the ArrayList
		//

		ArrayList<String> stringArr = new ArrayList<String>(Arrays.asList("hello", "goodbye"));
		;
		// stringArr.add(5);
		System.out.println(stringArr);

		ArrayList<Integer> intArr = new ArrayList<Integer>();
		Random rd = new Random(); // creating Random object
		for (int i = 0; i < 10; i++) {
			intArr.add(rd.nextInt(100));
		}
		System.out.println(intArr);

	}

}
