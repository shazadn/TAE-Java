package apollo.exercises.ch05_conditionals;

public class Ex5_CountEvens {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		// Call countEvens a few times with different arrays and print the result
		
		 int[] a = {2, 1, 2, 3, 4};
		 countEvens(a); 
		 int[] b = {2, 2, 0};
		 countEvens(b); 
		 int[] c = { 1, 3, 5};
		 countEvens(c); 
		 int[] d = { 8, 18, 16, 1, 27, 32};
		 countEvens(d); 
	}

	// Create a method called countEvens
	// Return the number of even ints in the given array.
	// Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

	// int a = {2, 1, 2, 3, 4};
	// countEvens(a); // -> 3
	// int b = {2, 2, 0};
	// countEvens(b); // -> 3
	// int c = { 1, 3, 5};
	// countEvens(c); // -> 0

	public static void countEvens(int[] arr) {
		int numEvenInts= 0;
		for (int i = 0; i < arr.length; i++) {
			if((arr[i]%2)==0) {
				numEvenInts ++;
			}
		}
		System.out.println(numEvenInts);
	}

}

/*
 * SAMPLE OUTPUT:
 * 
 * 3 0 2
 * 
 */