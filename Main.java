import java.util.HashSet;

public class Main{
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("James");
        st.add("Scott");
        st.add("James");
        System.out.println(st);
        System.out.println(st.contains("James"));
        System.out.println(st.size());
        System.out.println("Mark");
        for(String s : st){
            System.out.println(s);
        }
    }
}