package remote.commands;

import remote.command.Command;
import remote.entity.Light;

public class LightOnCommand implements Command {
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
	
}
