import java.util.*;

public class ListInterface{
    static void ArrayListExample(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1, 10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }
    static  void StackExample(){
        Stack<String> st = new Stack<>();
        st.push("pw");
        st.push("skills");
        st.pop();
        st.peek();
        st.size();
        st.empty();
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayListExample();
        StackExample();
    }
}