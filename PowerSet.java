import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    static List<String> allPossibleStrings(String s) {
        int n = s.length();
        List<String> res = new ArrayList<>();

        for (int i = 0; i < (1 << n); i++) {
            StringBuilder sub = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sub.append(s.charAt(j));
                }
            }
            res.add(sub.toString());
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> subsets = allPossibleStrings(s);

        for (String sub : subsets) {
            System.out.println(sub);
        }
    }
}