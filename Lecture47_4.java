public class Lecture47_4 {

    static int peak(int[] a) {
        int n = a.length;
        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            // Check if mid is peak
            if ((mid == 0 || a[mid] > a[mid - 1]) &&
                (mid == n - 1 || a[mid] > a[mid + 1])) {
                return mid;
            }

            // Move towards the higher neighbor
            if (mid < n - 1 && a[mid] < a[mid + 1]) {
                // uphill
                st = mid + 1;
            } else {
                // downhill
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 4, 7, 9, 8, 5, 2};
        System.out.println(peak(a));
    }
}
 