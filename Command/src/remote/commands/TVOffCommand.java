package remote.commands;

import remote.command.Command;
import remote.entity.Light;
import remote.entity.Stereo;
import remote.entity.TV;

public class TVOffCommand implements Command {
	private TV tv;
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}
	
}
