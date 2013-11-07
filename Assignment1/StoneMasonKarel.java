/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	/* Precondition: Karel standing at the start of the column.
	 * Postcondition: Karel is at the end of the column, with all the 
	 * columns is repaired.  
	 */
/*
 * Stone
 * */
	public void run(){
		
		while(frontIsClear()){
			
			repair();
			moveToNext();
			
		}
		repair();
		
	}	
	/* Pre-condition: Facing east at 1st street and 1st avenue.
	 * Post-condition: Facing east at the end of the volumn.
	 */
	
	private void repair(){
		ascend();
		descend();	
	}
	
	/*
	 * Pre-condition: Facing East at 1st street and 1st avenue
	 * Post-condition: Facing South just below the arc.
	 */
   private void ascend(){
	   turnLeft();
	   while(frontIsClear()){
		   putSafeBeeper();
		  move();
		   
	   }
	   putSafeBeeper();
	   turnAround();

   }
   /* To avoid the beeper in each corner is more than one,
    * safeBeeper can guarantee every corner have one beeper.
    */
   
   private void putSafeBeeper(){
		if(noBeepersPresent()){
			putBeeper();
		}
	}	
   
   /* Pre-condition: Facing South just below the arc.
    * Post-condition: Facing east at the 1st street.
    */
   private void descend(){
	while(frontIsClear()){
		move();
	}
	turnLeft();   
}   
	/* when karel came back from reparing, 
	 * he should move to another workpalce.	
	 */
   private void moveToNext(){
	   move();
	   move();
	   move();
	   move();
   }
	
}