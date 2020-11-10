import java.awt.geom.GeneralPath;

public class Triangle extends Shape {
	private float s = 250;
	private int x = 0;
	private int y = 0;
	
    public static java.awt.Shape createTriangle(final float s) {
        final GeneralPath p0 = new GeneralPath();
        p0.moveTo(300, 300 - s);
        p0.lineTo(300 + s, 300 + s);
        p0.lineTo(300 - s, 300 + s);
        p0.closePath();
        return p0;
    }
    public Triangle() {
        drawShape = createTriangle(250);
    }
    @Override
    public String getDescription() {
        return "Triangle";
    }
 // 설정된 s,x,y 값으로 이동하는 함수
    public void move() {
		final GeneralPath p0 = new GeneralPath();
		p0.moveTo(300+x, 300 - s+y);
		p0.lineTo(300 + s+x, 300 + s+y);
		p0.lineTo(300 - s+x, 300 + s+y);
		p0.closePath();
		drawShape = p0;
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
