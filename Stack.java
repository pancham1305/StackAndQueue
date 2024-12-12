import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    void push(T num) {
        list.add(num);
    }

    
}
