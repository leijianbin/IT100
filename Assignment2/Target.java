/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file draws three circles of different size from the center of the user window to output a target graphic.
 * It first determines the center coordinates of the window.
 * Then each circle is drawn from the center coordinates. 
 * The start position of each circle is determined by subtracting the radius of each circle from the center x and y values.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {

	//determine window's center
	private double centerx = 0;
	private double centery = 0;
	
	public void run() {
		centerx = getWidth()/2;
		centery = getHeight()/2;
		//first outer circle
		double firstRad = 72;//circle radius
		drawCircle(firstRad, Color.red);

		//second middle circle
		double secondRad = 0.65 * 72;
		drawCircle(secondRad, Color.white);

		//third inner circle
		double thirdRad = 0.3 * 72;
		drawCircle(thirdRad, Color.red);
	}
	
	private void drawCircle(double radium, Color color)
	{
		double Diam = radium * 2;//circle diameter
		double posx1 = centerx - radium;//circle x position
		double posy1 = centery - radium;//circle y position
		GOval Circle = new GOval(posx1,posy1,Diam,Diam);
		Circle.setFilled(true);
		Circle.setFillColor(color);
		add(Circle);
	}
}