
public abstract class TshirtDecorator extends Tshirt{
	protected Tshirt decoratedTshirt;

	public TshirtDecorator(Tshirt decoratedTshirt) {
		this.decoratedTshirt = decoratedTshirt;
	}
	
	@Override
    public String getDescription() {
		return this.getDescription();
	}
}
