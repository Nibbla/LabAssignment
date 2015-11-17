import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class OlympicViewer extends Applet {
	private BullsEye b;
	JFrame frame;
	private House h;
	private OlympicRings r;
	public OlympicViewer(){
		

		frame = new JFrame();
	     frame.setName("Bulls");
	      frame.setSize(400, 400);
	      frame.setVisible(true);   
	      b= new BullsEye(10,10,25, Color.BLACK);
	      
	      h= new House(10,50);
	      r = new OlympicRings(50,60);
	      repaint();
	      
	      
	}
	
	   public void paint(Graphics g)
	   { 
		   b.draw((Graphics2D) g);
		   h.draw((Graphics2D) g);
		   r.draw((Graphics2D) g);
	   }

}
