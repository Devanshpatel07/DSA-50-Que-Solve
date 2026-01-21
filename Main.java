
import java.util.HashMap;
import java.util.Map;

public class Main{
    static void HashMap(){
        Map<String , Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Yash", 1);
        mp.put("Lav", 11);
        mp.put("Rishika", 27);
        mp.put("Harry", 24);

        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));

        mp.put("Aksh", 25);
        System.out.println(mp.get(mp));

        System.out.println(mp.remove("Akash"));

        System.out.println("Akash");
        System.out.println("yash");

        mp.put("yash" ,30);
        mp.putIfAbsent("yash", 30);

        System.out.println(mp.keySet());

        System.out.println(mp.values());

        System.out.println(mp.entrySet());

        for(String key: mp.keySet()){
            System.out.println("Age of  is" +key + mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.println("Age of team" +e.getKey() +e.getValue());
        }
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.print("Age" + e.getKey());
        }
    }
    public static void main(String[] args) {
        Main mp = new Main();
        mp.HashMap();
    }
}