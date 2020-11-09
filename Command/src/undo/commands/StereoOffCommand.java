package undo.commands;

import undo.command.Command;
import undo.entity.Light;
import undo.entity.Stereo;

public class StereoOffCommand implements Command {
	private Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
	}
	
}
