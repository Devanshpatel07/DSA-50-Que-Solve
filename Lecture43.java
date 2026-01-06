public class Lecture43 {

    // find the largest element of the array
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void basicCountSort(int[] arr) {
        int max = findMax(arr);

        int[] count = new int[max + 1];

        // store frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // rebuild sorted array
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    static void display(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

static void CountSort(int[] arr) {
    int n = arr.length;
    int[] output = new int[n];
        int max = findMax(arr);

        int[] count = new int[max + 1];

        // store frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //make prefix sum
        for(int i=1 ; i<count.length ; i++){
            count[i] += count[i-1];
        }

        //find the index of each element
        for(int i=n-1;i>=0;i--){
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        //copy all elements of output array
        for(int i=1;i<count.length;i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 5};
        CountSort(arr);
        display(arr);
    }
}


//time complexity - wc = (n+k); where k = max_number
//space complexity =  (n+k)