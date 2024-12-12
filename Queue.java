import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    void enqueue(T num) {
        list.add(num);
    }

    T dequeue() {
        T ans = list.getFirst();
        list.removeFirst();
        return ans;
    }

    boolean isEmpty(){
        return list.isEmpty();
    }
    

}}
