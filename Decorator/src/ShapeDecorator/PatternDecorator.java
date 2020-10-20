package ShapeDecorator;

public class PatternDecorator  extends ShapeDecorator{
	public PatternDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public String getDescription() {
		return this.decoratedShape.getDescription() + " With Pattern";
	}
}
