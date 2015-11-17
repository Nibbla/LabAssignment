import java.awt.Rectangle;


public class Square extends Rectangle {

	public Square(int x, int y, int sideLength) {
		super();
		super.setLocation(x, y);
		super.setSize(sideLength, sideLength);
		
		
	}
	
	public int getArea(){
		return (int) (super.getWidth()*super.getWidth());
	}
	public String toString(){
		return super.toString() + " Area" + getArea();
	}
}
