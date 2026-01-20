import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer , String> mp = new HashMap<>();
        mp.put(3, "aman");
        mp.put(1, "Rohan");
        mp.put(2,"riya");
        System.out.println(mp);
       for(String i : mp.values()){
        System.out.println(i);
       }
    }
}
