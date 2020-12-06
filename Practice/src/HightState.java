
public class HightState implements State {
	FanwithState fan;
	public HightState(FanwithState fan) {
		 this.fan = fan;
	}
	
	@Override
	public void pull() {
		System.out.println("high State");
		this.fan.setState(this.fan.getOffState());
	}
}
