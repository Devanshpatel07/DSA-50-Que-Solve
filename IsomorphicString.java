import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {
        // Step 1: Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Data structures
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        // Step 3: Traverse strings
        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            // If character from s already mapped
            if (map.containsKey(sCh)) {
                if (map.get(sCh) != tCh) {
                    return false;
                }
            } 
            // If new mapping
            else {
                // Check if t character already used
                if (used.contains(tCh)) {
                    return false;
                }
                map.put(sCh, tCh);
                used.add(tCh);
            }
        }

        return true;
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        IsomorphicString obj = new IsomorphicString();

        System.out.println(obj.isIsomorphic("egg", "add")); // true
        System.out.println(obj.isIsomorphic("foo", "bar")); // false
        System.out.println(obj.isIsomorphic("ab", "aa"));   // false
    }
}


//Time complexity = 