/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file receives a list of values input by the user. And outputs the smallest and largest values.
 * If the user inputs "0", the output will indicate that there is no range, 
 * since the smallest and largest values are subsequently 0.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	private static final int SENTINEL = 0;
	public void run() {
		
		int test = calculateHexdecimal("f1");
		println(test);
		
		println("This program finds the largest and smallest numbers.");
		int val = readInt("? ");

		//the first value entered is set as the smallest and largest
		int smallest = val;
		int largest = val;

		//if the user enters the Sentinel as the first value
		if (val == SENTINEL) {
			println("There is no range.");
		}

		while (val != SENTINEL) {
			val = readInt("? ");
			//compare new value with defined smallest value to determine smaller value
			if (val < smallest && val != SENTINEL) {
				smallest = val;
			}
			//compare new value with defined largest value to determine larger value
			else if (val > largest && val != SENTINEL) {
				largest = val;
			}
		}
		println("smallest: " + smallest);
		println("largest: " + largest);
	}
	
	private int calculateHexdecimal(String letter){
		int result = 0;

		for(int i = 0; i < letter.length(); i++){
			int numdecimal = 0;
			char ch = letter.charAt(i);
			if(ch >= '0' && ch <= '9')
				numdecimal = ch - '0';
			else if(ch >= 'a' && ch <= 'f')
				numdecimal = ch - 'a' + 10;
			else
				println("Error Format");
			result = (result * 16 + numdecimal);
		}

		return result;
	}
}