package ceilingfanWithState;

public class LowState implements State {
	CeilingFanWithState fan;

	public LowState(CeilingFanWithState fan) {
		this.fan = fan;
	}
	@Override
	public void pull(CeilingFanWithState fan) {
		System.out.println("celing fan is LowState");
		this.fan.setState(this.fan.getMediumState());
	}

}
