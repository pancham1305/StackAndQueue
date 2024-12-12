public class main {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(70);
        st.push(30);
        st.push(56);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
        Queue<Integer> q = new Queue<>();
        q.enqueue(70);
        q.enqueue(30);
        q.enqueue(56);
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}