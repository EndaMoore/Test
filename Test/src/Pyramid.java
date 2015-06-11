import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram{
	
	
	public static final int BRICK_WIDTH = 30;
	public static final int BRICK_HEIGTH = 12;
	public static final int BRICK_IN_BASE = 14;

	
	public void run() {
		
		for (int i = 0; i < BRICK_IN_BASE; i++) {
			for (int j = 0; j < (BRICK_IN_BASE - i); j++) {
				int x = (getWidth() / 2) - ((BRICK_IN_BASE - i) * BRICK_WIDTH) / 2 + j * BRICK_WIDTH;
				int y = getHeight() - ((i + 1) * BRICK_HEIGTH);
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGTH);
				add(brick);
			}
		}
		
		
		
	}
}
