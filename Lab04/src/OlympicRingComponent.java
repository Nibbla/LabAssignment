import java.awt.Color;
import java.awt.Graphics2D;


public class OlympicRingComponent implements Drawable {
	private int x,y;
	private Color c;
	private int radius;
	
	
	public OlympicRingComponent(Color c, int radius, int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.c =c;
		this.radius = radius;
	}


	@Override
	public void draw(Graphics2D g2) {
		g2.setColor(c);
		g2.drawOval(x, y, radius, radius);

	}

}
