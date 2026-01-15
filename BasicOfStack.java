import java.util.Stack;

public class BasicOfStack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(23);
        st.push(4);
        //peak
        // System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println();
        System.out.println("size is :"+ st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
    }
}