import java.util.ArrayList;
import java.util.List;

public class Stack {

    List<Integer> stack = new ArrayList<>();

    public int size() {
        return stack.size();
    }

    public void push(int i) {
        stack.add(i);
    }

    public int pop() {
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if(stack.isEmpty()){
            
        }
        return stack.get(stack.size()-1);
    }
}
