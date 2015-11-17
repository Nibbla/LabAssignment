import java.awt.Color;
import java.awt.Graphics2D;


public class House implements Drawable {
	private int x,y;
	
	
	public House(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	@Override
	public void draw(Graphics2D g2) {
		g2.setColor(Color.BLUE);
		g2.drawLine(0+x, 15+y, 15+x, 0+y);
		g2.drawLine(15+x, 0+y, 30+x, 15+y);
		g2.drawLine(0+x, 15+y, 30+x, 15+y);
		
		g2.drawRect(x+1, y+16, 28, 38);
		
		g2.drawRect(x+5, y+30, 10, 23);
		g2.drawRect(x+17, y+20, 8, 15);

	}

}
