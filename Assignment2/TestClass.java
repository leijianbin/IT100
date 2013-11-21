/*
 * File: FindSecondLargest.java
 * Name: 
 * Section Leader: 
 * --------------------
 */

import acm.program.*;

public class TestClass extends ConsoleProgram {
	private static final int SENTINEL = 0;
	public void run() {
		
		println("This program finds the largest and smallest numbers.");
		
		int val = readInt("? ");
		int largest = val;
		int secondLargest;

		val = readInt("? ");
		if(val > largest){
			secondLargest = largest;
			largest = val;
		}
		else{
			secondLargest = val;
		}

		//if the user enters the Sentinel as the first value
		if (val == SENTINEL) {
			println("There is no range.");
		}

		while (val != SENTINEL) {
			val = readInt("? ");
			//compare new value with defined smallest value to determine smaller value
			if (val > largest && val != SENTINEL) {
				secondLargest = largest;
				largest = val;
			}
			else if (val < largest && val > secondLargest && val != SENTINEL)
			{
				secondLargest = val;
			}
		}
		println("secondLargest: " + secondLargest);
		println("largest: " + largest);
	}
}