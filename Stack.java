import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    void push(T num) {
        list.add(num);
    }

    T pop() {
        T ans = list.getLast();
        list.removeLast();
        return ans;
    }

    T peek() {
        return list.getLast();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    int size() {
        return list.size();
    }
}
