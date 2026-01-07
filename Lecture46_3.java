public class Lecture46_3 {

    // Search in rotated sorted array WITHOUT duplicates
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

    // Search in rotated sorted array WITH duplicates
    static int search_(int[] a, int target) {
        int st = 0, end = a.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (a[mid] == target) {
                return mid;
            }

            // Cannot determine sorted half due to duplicates
            if (a[st] == a[mid] && a[mid] == a[end]) {
                st++;
                end--;
            }
            // Left half is sorted
            else if (a[st] <= a[mid]) {
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
        int[] a = {1, 1, 1, 1, 1, 1, 2, 2, 3, 1};
        int target = 2;

        System.out.println(search_(a, target)); // works with duplicates
        System.out.println(search(a, target));  // works without duplicates
    }
}
