package simpleremote;

//invoke class
// ����...���� Ŀ�ǵ� =Ŀ�ǵ���Ʈ��
public class SimpleRemoteControl {
	Command slot;
	
	public void setCommand(Command slot) {
		this.slot = slot;
	}
	public void buttonOnPress() {
		this.slot.execute();
	}

}
