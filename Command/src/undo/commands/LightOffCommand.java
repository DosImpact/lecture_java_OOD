package undo.commands;

import undo.command.Command;
import undo.entity.Light;

public class LightOffCommand implements Command {
	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
	
}
