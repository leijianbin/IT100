/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	/*pre:karel standing at the Southeast corner,facing east
	 * post:karel standing at the middle of the row.
	 */
	public void run(){
		putBeeperOnTwoEnds();
		karelStandBetweenTwoBeepers();
		//clearBeepers();
		}
	 
	/* pre: karel standing at teh Southeast corner, facing east
	 * post: karel put two beepers on two ends of the row, facing east.
	 * 
	 */
	
	private void putBeeperOnTwoEnds(){
		
		while(frontIsClear()){
			move();
			
		}
		putBeeper();
		turnAround();
		move();
		while(frontIsClear()){
			move();
		}putBeeper();
	        turnAround();
	}
	
	/* pre: facing east,
	 * Post:karel standing between two beepers.
	 * 
	 */
		private void karelStandBetweenTwoBeepers(){
			move();
			if(facingEast()){
			while(noBeepersPresent()){
				move();
				
			}
				pickBeeper();
				turnAround();
				move();
				putBeeper();
				move();
			}
			
			if(facingWest()){ // 
				while(noBeepersPresent()){
					move();
					
				}
					pickBeeper();
					turnAround();
					move();
					putBeeper();
					move();	
			}	
		}		
	}
	


