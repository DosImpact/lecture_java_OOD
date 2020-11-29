package ceilingfanWithState;

public class OffState implements State {
	CeilingFanWithState fan;

	public OffState(CeilingFanWithState fan) {
		this.fan = fan;
	}

	@Override
	public void pull(CeilingFanWithState fan) {
		System.out.println("celing fan is off");
		this.fan.setState(this.fan.getLowState());
	}

}
