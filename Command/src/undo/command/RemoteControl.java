package undo.command;


//invoke class
// 전구...전구 커맨드 =커맨드컨트롤
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for(int i = 0 ; i < 7 ; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	
	public void setCommand(int slot,Command onCommand,Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	public void onButtonOnPress(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	public void offButtonOnPress(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	public void undoButtonOnpress() {
		undoCommand.undo();
	}

	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("---Remote Control---");
		for(int i = 0 ; i < onCommands.length; i++) {
			stringBuffer.append("[slot"+i+"]" + onCommands[i].getClass().getName() + "  "+ offCommands[i].getClass().getName() +"\n");
		}
		
		return stringBuffer.toString();
	}
}
