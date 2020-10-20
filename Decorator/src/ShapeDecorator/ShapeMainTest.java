package ShapeDecorator;

public class ShapeMainTest {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		
		Shape rect = new Rectangle();
		rect = new RedDecorator(rect);
		rect = new PatternDecorator(rect);
		rect.draw();
		
		Shape tri = new Triangle();
		tri = new RedDecorator(tri);
		tri = new PatternDecorator(tri); 
		tri = new PatternDecorator(tri); 
		tri.draw();
	}

}
