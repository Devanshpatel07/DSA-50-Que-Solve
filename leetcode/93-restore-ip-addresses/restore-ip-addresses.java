import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();

        backTrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backTrack(String s, int index, List<String> parts, List<String> result) {

        // Base case
        if (parts.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", parts));
            }
            return;
        }

        // Try taking 1, 2, or 3 digits
        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {

            // Get current part
            String part = s.substring(index, index + len);

            // Skip numbers with leading zeros
            if (part.length() > 1 && part.charAt(0) == '0')
                continue;

            int value = Integer.parseInt(part);

            // Check range
            if (value <= 255) {
                parts.add(part);                        // Choose
                backTrack(s, index + len, parts, result); // Explore
                parts.remove(parts.size() - 1);        // Backtrack
            }
        }
    }
}