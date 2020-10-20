package ShapeDecorator;

public abstract class Shape {
	public abstract String getDescription();
	
	public void draw() {
		System.out.println("draw " + getDescription());
	}
}
