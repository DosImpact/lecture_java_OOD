import java.util.HashMap;
import java.util.Stack;

public class ShapeMoveControl {
	// "up" MoveUpCommand ���� Hash �����Ͱ� ��.
    HashMap<String, Command> map = new HashMap<>();
    // execute ���� Stack�� Command�� push�ϰ�, undo ȣ��� Stack pop���� ����
    Stack<Command> stack = new Stack<>();

    
    // key - command �� �����ͽ��� �߰�
    public void setCommand(String key, Command command) {
        map.put(key, command);
    }

    // ��ɾ��� Ű�� ���ؼ� , shape�� �����Ų��.
    public void execute(String key,Shape shape) {
        map.get(key).execute(shape); 
        stack.push(map.get(key)); 
    }

    // undo ��ɾ� , stack pop �� ���� ����
    public void undo(Shape shape) {
    	if(stack.empty()) 
    		return;
        stack.pop().undo(shape); 
    }

}
