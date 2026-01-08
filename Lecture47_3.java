public class Lecture47_3 {

    static int peakIndexMountain(int[] a) {
        int st = 0;
        int end = a.length - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            if (a[mid] < a[mid + 1]) {
                // ascending part
                st = mid + 1;
            } else {
                // descending part
                end = mid;
            }
        }
        // st == end → peak index
        return st;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 4, 3, 2, 1};
        System.out.println(peakIndexMountain(a));
    }
}
