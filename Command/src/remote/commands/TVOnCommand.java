package remote.commands;

import remote.command.Command;
import remote.entity.Light;
import remote.entity.Stereo;
import remote.entity.TV;

public class TVOnCommand implements Command {
	private TV tv;
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}
	
}
