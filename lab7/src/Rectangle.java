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
 // 설정된 s,x,y 값으로 이동하는 함수
    public void move() {
		final GeneralPath p0 = new GeneralPath();
		p0.moveTo(40+x, 40+y);
		p0.lineTo(300+s+x, 40+y );
		p0.lineTo(300+s+x, 300+s+y);
		p0.lineTo(40+x, 300+s+y);
		p0.closePath();
		drawShape =  p0;
    }
    // 4방면으로 좌표를 지정한 후에, move함수를 이용해서 Path를 그리기
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