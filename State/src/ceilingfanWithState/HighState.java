package ceilingfanWithState;

public class HighState implements State {
	CeilingFanWithState fan;

	public HighState(CeilingFanWithState fan) {
		this.fan = fan;
	}
	@Override
	public void pull(CeilingFanWithState fan) {
		System.out.println("celing fan is high");
		this.fan.setState(this.fan.getOffState());
	}

}
