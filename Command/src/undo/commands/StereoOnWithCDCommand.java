package undo.commands;

import undo.command.Command;
import undo.entity.Light;
import undo.entity.Stereo;

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

	@Override
	public void undo() {
		stereo.off();
	}
	
}
