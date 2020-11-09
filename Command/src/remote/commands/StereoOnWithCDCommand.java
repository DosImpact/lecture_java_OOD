package remote.commands;

import remote.command.Command;
import remote.entity.Light;
import remote.entity.Stereo;

public class StereoOnWithCDCommand implements Command {
	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolumne(11);
	}
	
}
