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

	// You fill in this part
	public void run(){
		moveToArchTop();//
		while(frontIsClear()){
			if(!leftIsClear())
			{
				fixArchStone();//
			}
			move();
		}
		fixArchStone();
		moveToArchBottom();
	}
	
	private void moveToArchTop(){
		ascend();
	}
	private void moveToArchBottom(){
		descend();
	}
	
	private void fixArchStone(){
		//pre: facing east
		//post: facing east
		descend();	
		ascendWithBeeper();
	}
	
	private void ascendWithBeeper(){
		turnLeft();
		while(frontIsClear()){
			safePutBeeper();
			move();
		}
		safePutBeeper();
		turnRight();
	}
	
	private void ascend()
	{
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnRight();
	}
	
	private void descend()
	{
		turnRight();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}
	
	private void safePutBeeper(){
		if(noBeepersPresent())
		{
			putBeeper();
		}
	}
}
