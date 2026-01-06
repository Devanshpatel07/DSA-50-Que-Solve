public class Lecture44_3 {
//Given an array of size N containing only Os, 1s, and 2s; 
// sort the array in ascending order.
//  // Input: 
// // N=6 
// / arr[]={021200} 
// // Output: 
// // 000122
    static void display(int[] num) {
        for (int val : num) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void sort012(int[] num) {
        int lo = 0, mid = 0, hi = num.length - 1;

        while (mid <= hi) {
            if (num[mid] == 0) {
                swap(num, mid, lo);
                mid++;
                lo++;
            } else if (num[mid] == 1) {
                mid++;
            } else { // num[mid] == 2
                swap(num, mid, hi);
                hi--;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {2, 2, 0, 0, 1, 1, 2, 0, 1, 0};
        sort012(num);
        display(num);
    }
}
