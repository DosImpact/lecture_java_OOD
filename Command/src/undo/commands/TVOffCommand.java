package undo.commands;

import undo.command.Command;
import undo.entity.Light;
import undo.entity.Stereo;
import undo.entity.TV;

public class TVOffCommand implements Command {
	private TV tv;
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}
	
}
