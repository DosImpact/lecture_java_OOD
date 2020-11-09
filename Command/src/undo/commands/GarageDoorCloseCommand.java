package undo.commands;

import undo.command.Command;
import undo.entity.GarageDoor;

public class GarageDoorCloseCommand implements Command{
	private GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.close();
	}

	@Override
	public void undo() {
		garageDoor.open();
	}
	
}
  