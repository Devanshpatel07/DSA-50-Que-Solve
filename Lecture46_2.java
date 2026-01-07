public class Lecture46_2 { // important question
    static int search(int[] a, int target) {
        int st = 0, end = a.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (a[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (a[st] <= a[mid]) {
                if (target >= a[st] && target < a[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (target > a[mid] && target <= a[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1, 2};
        int target = 6;
        System.out.println(search(a, target));
    }
}
