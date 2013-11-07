/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	/*
	 * Karel is going to create a checkerboard pattern of beepers inside an
	 * empty rectangular world which could fit for various sizes of a
	 * checkerboard. pre-condition:karel is standing at the SOuthwest corner,
	 * facing east. Post-condition:karel is standing at the top of first column,
	 * facing north(8*8)
	 */
	public void run() {
		putOddBeeper();

		while (leftIsClear()) {
			repositionForRowToWest();
			putOddBeeper();

			if (rightIsClear()) {
				repositionForRowToEast();
				putOddBeeper();
			} else {
				turnRight();
			}
		}
	}

	/*
	 * pre-condition:karel standing at the Southwestmost corner,facing east.
	 * post-condition:karel standing at the end of the row,facing east.
	 */
	private void putOddBeeper() {
		putBeeper();

		while (frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
			}
		}

	}

	/*
	 * pre-condition:karel is standing at the end of this row,facing east.
	 * post-condition:karel is standing at the adjacent row, facing west.
	 */

	private void repositionForRowToWest() {
		turnLeft();
		move();
		turnLeft();
	}

	// ??
	private void repositionForRowToEast() {
		turnRight();
		move();
		turnRight();
	}

}
