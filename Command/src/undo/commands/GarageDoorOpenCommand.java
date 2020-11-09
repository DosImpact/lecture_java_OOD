package undo.commands;

import undo.command.Command;
import undo.entity.GarageDoor;

public class GarageDoorOpenCommand implements Command{
	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.open();
	}

	@Override
	public void undo() {
		garageDoor.close();
	}
	
}
