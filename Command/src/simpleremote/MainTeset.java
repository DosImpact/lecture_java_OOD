package simpleremote;

public class MainTeset {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light); 
		GarageDoorCloseCommand garageDoorCloseCommand =new GarageDoorCloseCommand(garageDoor);
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOnCommand);
		remote.buttonOnPress();
		remote.setCommand(lightOffCommand);
		remote.buttonOnPress();
		remote.setCommand(garageDoorCloseCommand);
		remote.buttonOnPress();
		remote.setCommand(garageDoorOpenCommand);
		remote.buttonOnPress();
		
	}

}
