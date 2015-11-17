import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseApplet extends Applet
{ private Rectangle box;
 
  public MouseApplet()
   {  box = new Rectangle(100, 100, 20, 30);
      class MousePressListener implements MouseListener
      {  public void mousePressed(MouseEvent event)
         {  int x = event.getX();
            int y = event.getY();
            box.setLocation(x, y);
            repaint();// repaints the applet
         }
         public void mouseReleased(MouseEvent event) {}
         public void mouseClicked(MouseEvent event) {}
         public void mouseEntered(MouseEvent event) {}
         public void mouseExited(MouseEvent event) {}
      }
      MouseListener listener = new MousePressListener();
      addMouseListener(listener);
   }
   public void paint(Graphics g)
   {  Graphics2D g2 = (Graphics2D)g;
      g2.draw(box);
   }
} 
