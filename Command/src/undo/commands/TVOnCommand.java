package undo.commands;

import undo.command.Command;
import undo.entity.Light;
import undo.entity.Stereo;
import undo.entity.TV;

public class TVOnCommand implements Command {
	private TV tv;
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}
	@Override
	public void undo() {
		tv.off();
	}
	
}
