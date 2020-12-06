
public class LowState implements State {
	FanwithState fan;
	public LowState(FanwithState fan) {
		 this.fan = fan;
	}
	
	@Override
	public void pull() {
		System.out.println("low State");
		this.fan.setState(this.fan.getMidState());
	}
}
