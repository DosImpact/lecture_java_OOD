package ShapeDecorator;

public class RedDecorator  extends ShapeDecorator{
	public RedDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public String getDescription() {
		return this.decoratedShape.getDescription() + " With Red Color";
	}
}
