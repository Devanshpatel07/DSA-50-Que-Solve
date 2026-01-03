public class Lecture38 {
    static  void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0 ; i<n-1 ; i++){


            int min_index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]< arr[min_index]){
                    min_index = j;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }
    public static void main(String[] args) {
        int arr[] = {7,4,5,1,2};
        selectionSort(arr);
        for(int i=0;i<arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
//space complexity = O(1)
//time complexity = O(n**2) 