package apollo.exercises.ch04_loops;

import java.util.Arrays;

public class Ex5_ShiftLeft {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		// Call shiftLeft and print out the result with a few different arrays.
		int[] a = { 6, 2, 5, 3 };
		int[] b = { 1, 2 };
		int[] c = { 1 };
		int[] d = { 8, 4, 2, 1, 0 };

		shiftLeft(a);
		shiftLeft(b);
		shiftLeft(c);
		shiftLeft(d);
	}

	// Create a method called shiftLeft
	// Return an array that is "left shifted" by one --
	// so {6, 2, 5, 3} returns {2, 5, 3, 6}. Y
	// You may modify and return the given array, or return a new array.

	// int a = {6, 2, 5, 3};
	// shiftLeft(a); // => {2, 5, 3, 6}
	// int b = {1, 2};
	// shiftLeft(b); // => {2, 1}
	// int c = {1};
	// shiftLeft(c); // => {1}

	public static void shiftLeft(int[] arr) {
		int first = arr[0];
		for (int i = 1; i < arr.length; i++) {
//			int temp = arr[i];
//			arr[i-1] = temp;
			arr[i - 1] = arr[i];

		}
		arr[arr.length - 1] = first;
		System.out.println(Arrays.toString(arr));

	}

}

/*
 * SAMPLE OUTPUT:
 * 
 * {2, 5, 3, 6} {2, 1} {1}
 * 
 */