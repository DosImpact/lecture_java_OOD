import java.awt.geom.GeneralPath;

public class Rectangle extends Shape {

	private float s = 250;
	private int x = 0;
	private int y = 0;
	
    public static java.awt.Shape createRectangle(final float s) {
        final GeneralPath p0 = new GeneralPath();
        p0.moveTo(40, 40);
        p0.lineTo(300 + s, 40);
        p0.lineTo(300 + s, 300 + s);
        p0.lineTo(40, 300 + s);
        p0.closePath();
        return p0;
    }

    public Rectangle() {
        drawShape = createRectangle(250);
    }

    @Override
    public String getDescription() {
        return "Rectangle";
    }
 // ������ s,x,y ������ �̵��ϴ� �Լ�
    public void move() {
		final GeneralPath p0 = new GeneralPath();
		p0.moveTo(40+x, 40+y);
		p0.lineTo(300+s+x, 40+y );
		p0.lineTo(300+s+x, 300+s+y);
		p0.lineTo(40+x, 300+s+y);
		p0.closePath();
		drawShape =  p0;
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