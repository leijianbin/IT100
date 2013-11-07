/*
 * File: PythagoreanTheorem.java
 * Name: wangli
 * Section Leader: jianbin Ray
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class TestClass extends ConsoleProgram {
	
	/*
	 * this program solve the typical PythagoreanTheorem program, which you
	 * input an integer a, and a integer b, you will get the corresponding
	 * integer c.
	 */
	
	public void run() {
		println("Enter values to compute PythagoreanTheorem.");
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		double x = Math.pow(a, 2) + Math.pow(b, 2);
		double c = Math.sqrt(x);
		println("c:" + c);
	}
}