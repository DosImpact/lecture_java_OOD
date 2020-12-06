
public class OffState implements State {
	FanwithState fan;
	public OffState(FanwithState fan) {
		 this.fan = fan;
	}
	@Override
	public void pull() {
		System.out.println("off State");
		fan.setState(fan.getLowState());
	}
}
