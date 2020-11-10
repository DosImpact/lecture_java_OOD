import java.util.HashMap;
import java.util.Stack;

public class ShapeMoveControl {
    HashMap<String, Command> map = new HashMap<>();
    Stack<Command> stack = new Stack<>();

    public void setCommand(String key, Command command) {

        map.put(key, command);
    }

    public void execute(Shape shape, String key) {

        map.get(key).execute(shape); // key에 맞는 command의 execute 실행.
        stack.push(map.get(key)); // 실행한 command 저장

    }

    public void undo(Shape shape) {

        stack.pop().undo(shape); // 이전에 실행한 커맨드 undo 실행

    }

}
