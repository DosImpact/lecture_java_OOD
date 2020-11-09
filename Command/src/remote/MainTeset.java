package remote;

import remote.command.RemoteControl;
import remote.commands.GarageDoorCloseCommand;
import remote.commands.GarageDoorOpenCommand;
import remote.commands.LightOffCommand;
import remote.commands.LightOnCommand;
import remote.commands.StereoOffCommand;
import remote.commands.StereoOnWithCDCommand;
import remote.commands.TVOffCommand;
import remote.commands.TVOnCommand;
import remote.entity.CeilingFan;
import remote.entity.GarageDoor;
import remote.entity.Light;
import remote.entity.Stereo;
import remote.entity.TV;

public class MainTeset {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		
		Light light = new Light("Living Room");
		Light light2 = new Light("bath Room");
		CeilingFan ceilingFan = new CeilingFan("bath Room");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("ground");
		TV  tv = new TV("hall");
		
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light); 
		LightOnCommand light2OnCommand = new LightOnCommand(light2);
		LightOffCommand light2OffCommand = new LightOffCommand(light2); 
		GarageDoorCloseCommand garageDoorCloseCommand =new GarageDoorCloseCommand(garageDoor);
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		TVOffCommand tvOffCommand = new TVOffCommand(tv);
		TVOnCommand tvOnCommand = new TVOnCommand(tv);
		
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, light2OnCommand, light2OffCommand);
		remoteControl.setCommand(2, garageDoorCloseCommand, garageDoorOpenCommand);
		remoteControl.setCommand(3, stereoOffCommand, stereoOnWithCDCommand);
		remoteControl.setCommand(4, tvOffCommand, tvOnCommand);
		System.out.println(remoteControl);
		
		for(int i = 0 ; i < 5; i++) {
			remoteControl.offButtonOnPress(i);
			remoteControl.onButtonOnPress(i);
		}
		

		
		
		
		
	}

}
