public class Lecture43_2 {

    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void countSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // store frequency of digits
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / place) % 10;
            count[digit]++;
        }

        // prefix sum
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // build output array (stable sort)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / place) % 10;
            int idx = count[digit] - 1;
            output[idx] = arr[i];
            count[digit]--;
        }

        // copy output to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr) {
        int max = findMax(arr);

        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    public static void main(String[] args) {
        int[] arr = {43, 453, 626, 894, 8, 3};
        radixSort(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}


//Time Complexity = (n+k)
//space complexity = linear
