import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public void helper(int[] nums, List<Integer> ds, boolean[] isValid, List<List<Integer>> ans) {

        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds)); // add a copy
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!isValid[i]) {
                ds.add(nums[i]);
                isValid[i] = true;

                helper(nums, ds, isValid, ans);

                // backtrack
                isValid[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];

        helper(nums, ds, isValid, ans);
        return ans;
    }
}
