/*
* File: Fibonacci.java
* --------------------
* This program lists the terms in the Fibonacci sequence up to
* a constant MAX_TERM_VALUE, which is the largest Fibonacci term
* the program will display.
*/
import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	private static final int MAX_TERM_VALUE = 10000;
	
	public void run() {
		println("This is program lists the Fibonacci sequence");
		int max = readInt("Please input MAX_TERM_VALUE: ");
		fab(max);
	}
	
	private void fab(int max){
		int t1 = 0;
		int t2 = 1;
		while(t1 < max){
			println(t1);
			int temp = t1 + t2;
			t1 = t2;
			t2 = temp;
		}
	}
}