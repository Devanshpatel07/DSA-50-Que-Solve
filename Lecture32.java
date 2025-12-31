public class Lecture32 {
    static void printArr(int[] arr , int idx){
        // base case
        if(idx == arr.length){
            return;
        }

        //self work
        System.out.println(arr[idx]);

        //recursive work
        printArr(arr, idx+1);
    }

    static int maxInArray(int arr[], int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        //small problem idx +1 , end of array -> max
        int smallAns = maxInArray(arr , idx+1);

        // self work
        return Math.max(arr[idx] , smallAns);
    }

    static int sumOfArray(int[] arr, int  idx){
        if(idx == arr.length){
            return 0;
        }

        //recursive work
        int smallAns = sumOfArray(arr , idx+1);

        //self work
        return smallAns + arr[idx];

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //  printArr(arr, 0);
        //  System.out.println(maxInArray(arr ,0));
        System.out.println(sumOfArray(arr,0));
    }
}
