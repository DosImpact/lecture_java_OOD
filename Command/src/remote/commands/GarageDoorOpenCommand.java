package remote.commands;

import remote.command.Command;
import remote.entity.GarageDoor;

public class GarageDoorOpenCommand implements Command{
	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.open();
	}
	
}
