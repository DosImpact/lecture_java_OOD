
public class MidState implements State {
	FanwithState fan;
	public MidState(FanwithState fan) {
		 this.fan = fan;
	}
	
	@Override
	public void pull() {
		System.out.println("midState");
		this.fan.setState(fan.getHighState());
	}
}
