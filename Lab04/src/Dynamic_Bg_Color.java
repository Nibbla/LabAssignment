import javax.swing.*;
import java.awt.*;

public class Dynamic_Bg_Color extends JPanel{

JFrame frame;

public Dynamic_Bg_Color(){
frame = new JFrame("BG Color Changer");
}

public void paint(Graphics g1){
Graphics g = (Graphics2D)g1;

g.setColor(Color.pink);
g.fillRect(20,20,frame.getWidth()-20,100);
}

public static void main(String[] args){
Dynamic_Bg_Color d = new Dynamic_Bg_Color();
Dimension size = new Dimension(500,400);
d.setPreferredSize(new Dimension(size));
d.setMinimumSize(new Dimension(size));
d.setMaximumSize(new Dimension(size));

d.frame.add(d);
d.frame.setLocationRelativeTo(null);
d.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
d.frame.setLayout(new FlowLayout());
d.frame.pack();
d.frame.setVisible(true);
d.frame.getContentPane().setBackground(Color.cyan);
}

}