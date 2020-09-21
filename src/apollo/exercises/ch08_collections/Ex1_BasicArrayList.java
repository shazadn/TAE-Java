package apollo.exercises.ch08_collections;

import java.util.ArrayList;

public class Ex1_BasicArrayList {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		// Directions:
		//
		// 1) Declare am ArrayList of strings
		// 2) Call the add method and add 10 random strings
		// 3) Iterate through all the elements in the ArrayList
		// 4) Remove the first and last element of the ArrayList
		// 5) Iterate through all the elements in the ArrayList, again.

		ArrayList<String> stringArr = new ArrayList<String>();
		stringArr.add("abc");
		stringArr.add("Hello");
		stringArr.add("My");
		stringArr.add("Name");
		stringArr.add("is");
		stringArr.add("Shazad");
		stringArr.add("abc");
		stringArr.add("Nasim");
		stringArr.add("!!!");
		

		
		for(int i=0; i < stringArr.size();i++) {
			System.out.println(stringArr.get(i));
		}
		System.out.println("////////////");
		stringArr.remove(0);
		stringArr.remove(stringArr.size()-1);
		
		for (String elem : stringArr) {
			System.out.println(elem);
		}
		
	}

}
