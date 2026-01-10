
import java.util.Arrays;

public class MyArrayList {

    public static class Array1 {
        int[] arr = new int[5];
        int size = 0;

        public void add(int ele) {
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr, arr.length*2);
                // arr = new int[brr.length];
                // arr = Arrays.copyOf(brr,brr.length);
                arr = brr;
            }
            arr[size] = ele;
            size++;
        }

        public int size() {
            return size;
        }
        public void set(int idx , int val){
            arr[idx] = val;
        }
    }

    public static void main(String[] args) {
        Array1 arr = new Array1();
        arr.add(2);
        arr.add(1);

        System.out.println(arr.size);
        arr.set(0,10);

    }
}
