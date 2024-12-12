import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    void enqueue(T num) {
        list.add(num);
    }
    
}
