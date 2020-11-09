package undo.commands;

import undo.command.Command;
import undo.entity.CeilingFan;

public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;
	
	
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {	
		this.prevSpeed = ceilingFan.getLevel();
		this.ceilingFan.high();
	}

	@Override
	public void undo() {
		if(prevSpeed == CeilingFan.HIGH)
			ceilingFan.high();
		else if(prevSpeed == CeilingFan.MEDIUM)
			ceilingFan.medium();
		else if(prevSpeed == CeilingFan.LOW)
			ceilingFan.low();
		else if(prevSpeed == CeilingFan.OFF)
			ceilingFan.off();
	}

	

}
