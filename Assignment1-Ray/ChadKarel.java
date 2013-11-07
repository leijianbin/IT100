/* File: ChadKarel.java
 * 
 * A program in which Karel cleans up hanging chads from a
 * ballot. The specifications of this program are set out in
 * "Handout 08: Section Handout #1"
 */

import stanford.karel.*;

public class ChadKarel extends SuperKarel {
	
	/* Precondition: Karel stands at the start of the ballot.
	 * Postcondition: Karel is at the end of the ballot and all chad
	 * has been cleared.
	 */
	public void run() {
		/* To avoid the fencepost problem, we split the logic into
		 * a loop to process rectangles, plus one final call to
		 * check the last rectangle.
		 */
		while (frontIsClear()){
			processRect();
			move();
		}
		processRect();
	}
	
	private void processRect() {
		/* Precondition: Karel is standing in the center of rect, facing east
		 * Postcondition: Karel is standing in the center of rect, facing east, clean all the chad.
		 */
		if (noBeepersPresent()) {
			removeAllChad();
		}
	}
	
	private void removeAllChad() {
		/* asdsad
		 * sdasd
		 */		
		//
		turnLeft();
		cleanChad(); // clear the chad in front of you.
		//
		turnAround();
		cleanChad();
		
		//
		turnLeft();
	}
	
	private void cleanChad() {
		/*
		 * 
		 */
		move();
		while(beepersPresent()) {
			pickBeeper();
		}
		moveBackward();
	}
	
	private void moveBackward() {
		turnAround();
		move();
		turnAround();
	}
}
