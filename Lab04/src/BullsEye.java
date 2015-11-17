import java.awt.Color;
import java.awt.Graphics2D;


public class BullsEye implements Drawable{

	private Color c;
	private int radius;
	private int y;
	private int x;

	public BullsEye(int x, int y, int radius, Color c) {
		this.c = c;
		this.radius = radius;
		this.x =x;
		this.y=y;
	}

	@Override
	public void draw(Graphics2D g2) {
		int width = radius;
		int height = radius;
		g2.setColor(Color.CYAN);
		 g2.fillRect(0, 0, 200, 200);
		g2.setColor(c);
	  g2.fillOval(x+10, y+10, width, height);
	  g2.setColor(Color.WHITE);
	  g2.fillOval(x+11, y+11, width-2, height-2);
	  g2.setColor(c);
	  g2.fillOval(x+13, y+13, width-6, height-6);
	  g2.setColor(Color.WHITE);
	  g2.fillOval(x+15, y+15, width-10, height-10);
	  g2.setColor(c);
	  g2.fillOval(x+20, y+20, width-20, height-20);
		
	}
	
	

}
