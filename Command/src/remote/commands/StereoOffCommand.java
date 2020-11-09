package remote.commands;

import remote.command.Command;
import remote.entity.Light;
import remote.entity.Stereo;

public class StereoOffCommand implements Command {
	private Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}
	
}
