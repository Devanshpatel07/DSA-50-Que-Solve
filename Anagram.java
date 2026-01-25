import java.util.*;

public class Anagram {

    static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : str.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        return mp;
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> mp = makeFreqMap(s);

        for (char ch : t.toCharArray()) {
            if (!mp.containsKey(ch) || mp.get(ch) == 0) {
                return false;
            }
            mp.put(ch, mp.get(ch) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("rat", "car"));       // false
    }
}
