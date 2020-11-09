package simpleremote;

//invoke class
// 전구...전구 커맨드 =커맨드컨트롤
public class SimpleRemoteControl {
	Command slot;
	
	public void setCommand(Command slot) {
		this.slot = slot;
	}
	public void buttonOnPress() {
		this.slot.execute();
	}

}
