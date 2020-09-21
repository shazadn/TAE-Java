package apollo.exercises.ch08_collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex4_RemoveOdd {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {

		// Create a method called removeOdd
		// Remove all the odd numbers from an ArrayList

		// removeOdd(Arrays.asList(1,2,3,5,8,13,21)) => {2, 8}
		// removeOdd(Arrays.asList(7,34,2,3,4,62,3)) => {34, 2, 4, 62}

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(7,34,2,3,4,62,3));
		removeOdd(list);
	}

	public static void removeOdd(ArrayList<Integer> list) {
		ArrayList<Integer> toRemove = new ArrayList<Integer>();

		for (int elem : list) {
			if ((elem % 2) != 0) {
				toRemove.add(elem);
			}
		}
		list.removeAll(toRemove);

		System.out.println(list);

	}

}
