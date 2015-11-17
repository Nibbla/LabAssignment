import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;


public class OlympicRings implements Drawable {
	private int x,y;
	ArrayList<OlympicRingComponent> rings = new ArrayList<OlympicRingComponent>(5);
	
	public OlympicRings(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		rings.add(new OlympicRingComponent(Color.BLUE, 10, 5+x, 5+y));
		rings.add(new OlympicRingComponent(Color.YELLOW, 10, 10+x, 10+y));
		rings.add(new OlympicRingComponent(Color.BLACK, 10, 15+x, 5+y));
		rings.add(new OlympicRingComponent(Color.GREEN, 10, 20+x, 10+y));
		rings.add(new OlympicRingComponent(Color.RED, 10, 25+x, 5+y));
	}


	@Override
	public void draw(Graphics2D g2) {
		for (OlympicRingComponent ol : rings) {
			ol.draw(g2);
		}

	}

}
