public class Lecture44_2 {

    static void display(int[] num) {
        for (int val : num) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void partition(int[] num) {
        int l = 0, r = num.length - 1;

        while (l < r) {

            while (l < r && num[l] < 0) {
                l++;
            }

            while (l < r && num[r] >= 0) {
                r--;
            }

            if (l < r) {
                int temp = num[l];
                num[l] = num[r];
                num[r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {-13, 20, 7, 8, -4, -13, 11, -5, -13};
        partition(num);
        display(num);
    }
}
