import java.util.HashMap;
import java.util.Stack;

public class ShapeMoveControl {
	// "up" MoveUpCommand 등의 Hash 데이터가 들어감.
    HashMap<String, Command> map = new HashMap<>();
    // execute 마다 Stack에 Command를 push하고, undo 호출시 Stack pop으로 실행
    Stack<Command> stack = new Stack<>();

    
    // key - command 로 데이터쌍을 추가
    public void setCommand(String key, Command command) {
        map.put(key, command);
    }

    // 명령어의 키를 통해서 , shape를 실행시킨다.
    public void execute(String key,Shape shape) {
        map.get(key).execute(shape); 
        stack.push(map.get(key)); 
    }

    // undo 명령어 , stack pop 을 통해 실행
    public void undo(Shape shape) {
    	if(stack.empty()) 
    		return;
        stack.pop().undo(shape); 
    }

}
