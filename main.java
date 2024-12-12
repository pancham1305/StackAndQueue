public class main {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(70);
        st.push(30);
        st.push(56);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}