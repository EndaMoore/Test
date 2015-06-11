import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
import acm.graphics.*;
import acm.program.*;

public class Pyramid {
	
	//public static final int WINDOW_WIDTH = 600;
	//public static final int WINDOW_HEIGHT = 400;
	public static final int BRICK_WIDTH = 30;
	public static final int BRICK_HEIGTH= 12;
	public static final int BRICK_IN_BASE = 14;
	
	public void run() {
		
		//setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		GRect brick = new GRect(BRICK_WIDTH, BRICK_HEIGTH);
		brick.setColor(Color.BLACK);
		
		for (int i = 0; i < 14; i++) {
			//add(brick);
		}
	}
	

}
