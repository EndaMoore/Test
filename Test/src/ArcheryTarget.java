import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;


public class ArcheryTarget extends GraphicsProgram {
	
	public void run() {
		
		GOval outer = new GOval(25, 25, 75, 75);
		outer.setFillColor(Color.RED);
		outer.setFilled(true);
		add(outer);
		
		GOval middle = new GOval(37.5, 37.5, 50, 50 );
		middle.setFillColor(Color.WHITE);
		middle.setFilled(true);
		add(middle);

		GOval inner = new  GOval(50, 50, 25, 25);
		inner.setColor(Color.RED);
		inner.setFilled(true);
		add(inner);
	}

}
