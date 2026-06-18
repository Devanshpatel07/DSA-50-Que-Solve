class Solution {
    public void sortColors(int[] nums) {
        int low = 0;                  // Boundary pointer for 0s (Red)
        int mid = 0;                  // Scanner pointer
        int high = nums.length - 1;   // Boundary pointer for 2s (Blue)

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Found a 0: Swap it into the low boundary
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Found a 1: It's already in the middle, just move past it
                mid++;
            } else if (nums[mid] == 2) {
                // Found a 2: Swap it into the high boundary
                swap(nums, mid, high);
                high--;
                // Note: Do NOT increment mid here! The element swapped from 
                // 'high' is unexamined and needs to be checked in the next iteration.
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}