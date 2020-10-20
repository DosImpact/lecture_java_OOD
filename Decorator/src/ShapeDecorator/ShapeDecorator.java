package ShapeDecorator;

public abstract class ShapeDecorator extends Shape {
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	@Override
	public  String getDescription() {
		return this.getDescription();
	}
	
}
