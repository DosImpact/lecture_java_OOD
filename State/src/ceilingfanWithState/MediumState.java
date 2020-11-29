package ceilingfanWithState;

public class MediumState implements State {
	CeilingFanWithState fan;

	public MediumState(CeilingFanWithState fan) {
		this.fan = fan;
	}
	@Override
	public void pull(CeilingFanWithState fan) {
		System.out.println("celing fan is MediumState");
		this.fan.setState(this.fan.getHighState());
	}

}
