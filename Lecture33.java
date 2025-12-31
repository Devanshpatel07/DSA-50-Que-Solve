public class Lecture33 {

    static boolean search(int[] a, int n, int target, int idx) {
        if (idx >= n) return false;

        if (a[idx] == target)
            return true;

        return search(a, n, target, idx + 1);
    }

    // return index of target
    static int findIndex(int[] a, int n, int target, int idx) {
        if (idx >= n) return -1;

        if (a[idx] == target)
            return idx;

        return findIndex(a, n, target, idx + 1);
    }

    static void findAllIndex(int[] a, int n, int target, int idx) {
        if (idx >= n) {
            return;
        }

        if (a[idx] == target) {
            System.out.println(idx);
        }

        findAllIndex(a, n, target, idx + 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int target = 4;
        int n = a.length;

        // search
        System.out.println(search(a, n, target, 0));

        // find first index
        System.out.println(findIndex(a, n, target, 0));

        // find all indexes
        findAllIndex(a, n, target, 0);
    }
}

