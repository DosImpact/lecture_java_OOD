import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.Graphics2D;

public class Circle extends Shape {

	private float s = 250;
	private int x = 0;
	private int y = 0;
	
    public static java.awt.Shape createCircle(final float s) {
        return new Ellipse2D.Double(70, 80, s + 200, s + 200);
    }

    public Circle() {
        drawShape = createCircle(250);
    }

    @Override
    public String getDescription() {
        return "Circle";
    }
    // ������ s,x,y ������ �̵��ϴ� �Լ�
    public void move() {
		drawShape =  new Ellipse2D.Double(70+x, 80+y, s+200, s+200);;
    }
 // 4������� ��ǥ�� ������ �Ŀ�, move�Լ��� �̿��ؼ� Path�� �׸���
    public void moveDown() {
    	this.y = this.y + 10;
    	move();
    }
    public void moveUp() {
    	this.y = this.y - 10;
    	move();
    }
    public void moveLeft() {
    	this.x = this.x - 10;
    	move();
    }
    public void moveRight() {
    	this.x = this.x + 10;
    	move();
    }

}