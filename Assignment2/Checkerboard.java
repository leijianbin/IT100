/*
 * File: Checkerboard.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Checkerboard problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Checkerboard extends GraphicsProgram {
	
	private static final int NROWS = 8;
	private static final int NCOLUMNS = 8;
	
	public void run() {
		/* You fill this in */
		int sqSize = getHeight() / NROWS;
		int remaider = getHeight() % NROWS;
		int x = 0;
		int y = 0;
		for (int i = 0; i < NCOLUMNS; i++)
		{
			for(int j = 0; j < NROWS; j++)
			{
				x = j * sqSize;
				y = i * sqSize;
				GRect sq = new GRect(x, y, sqSize, sqSize);
				sq.setFilled(((i + j) % 2) != 0);
				sq.setFillColor(Color.RED);
				add(sq);
			}
		}

	}
}