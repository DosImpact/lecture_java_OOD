
public class FanwithState {
	State offState;
	State lowState;
	State midState;
	State highState;
	State state;
	
	public FanwithState() {
		this.offState = new OffState(this);
		this.lowState = new LowState(this);
		this.midState = new MidState(this);
		this.highState = new HightState(this);
		this.state = this.offState;
	}
	
	public void pull() {
		this.state.pull();
	}
	
	public State getOffState() {
		return offState;
	}
	public State getLowState() {
		return lowState;
	}
	public State getMidState() {
		return midState;
	}
	public State getHighState() {
		return highState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	

}
