package apollo.exercises.ch08_collections;

import java.util.HashMap;
import java.util.Map;

public class Ex5_NumberOfOccurrences {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {

		// Create a method called printOccurrences(int[] scores)
		//
		// int[] scores = {85,93,96,96,92,100,91,85,87,92};
		// printOccurrences(scores)
		//
		// HINT: Use a HashMap to keep track of the counts (K: Integer, V: Integer)
		//
		// Output:
		// 85 - 2
		// 87 - 1
		// 92 - 2
		// 93 - 1
		// 96 - 2
		// 100 - 1
		//
		int[] scores = { 85, 93, 96, 96, 92, 100, 91, 85, 87, 92 };
		printOccurrences(scores);

	}

	public static void printOccurrences(int[] scores) {
		int length = scores.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < length; i++) {
			int key = scores[i];
			if (map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, value + 1);
			} else {
				map.put(key, 1);
			}
		}

		System.out.println(map);

	}

}
