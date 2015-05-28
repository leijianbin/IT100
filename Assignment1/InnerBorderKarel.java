/* File: InnerBorderKarel.java */ 

import stanford.karel.*; 

public class InnerBorderKarel extends SuperKarel { 

	public void run() { 
		moveUpRow();
		innerSolidWall(); 
	} 

// Moves Karel up one row while keeping the same orientation 
	private void moveUpRow() { 
		turnLeft(); 
		move(); 
		turnRight(); 
	} 

	private void innerSolidWall(){
		while((facingEast() && leftIsClear()) || (facingWest() && rightIsClear()))
		{
			buildRow();
			moveToNextPosition();
		}
	}

	private void buildRow(){
		move();
		while(frontIsClear()){
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}

	private void moveToNextPosition(){
		if(facingEast()){
			turnLeft();
			move();
			turnLeft();
		}
		else{
			turnRight();
			move();
			turnRight();
		}
	}

} 