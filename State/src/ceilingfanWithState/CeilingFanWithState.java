package ceilingfanWithState;

public class CeilingFanWithState {
	
	
	State offState;
	State lowState;
	State mediumState;
	State highState;
	
	State state;
	
		
	public CeilingFanWithState() {
		this.offState = new OffState(this);
		this.lowState = new LowState(this);
		this.mediumState = new MediumState(this);
		this.highState = new HighState(this);
		this.state = this.offState;
	}
	
	public void pull() {
		this.state.pull(this);
	}

	public State getOffState() {
		return offState;
	}


	public void setOffState(State offState) {
		this.offState = offState;
	}


	public State getLowState() {
		return lowState;
	}


	public void setLowState(State lowState) {
		this.lowState = lowState;
	}


	public State getMediumState() {
		return mediumState;
	}


	public void setMediumState(State mediumState) {
		this.mediumState = mediumState;
	}


	public State getHighState() {
		return highState;
	}


	public void setHighState(State highState) {
		this.highState = highState;
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}

}
