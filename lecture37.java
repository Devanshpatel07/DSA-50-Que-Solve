public class lecture37 {
    static void bubbleSort(int[] a){
        int n = a.length;
        for(int i=0 ; i<n-1;i++){
        boolean flag = false;
            for(int j=0 ;j<n-i-1 ;j++){
                if(a[j]>a[j+1]){

                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                flag = true;

                }
            }
            if(flag == false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4};
        bubbleSort(a);
        for (int i : a) {
            System.out.print(i+ " ");
        }
    }
}

//time complexity = O(n**2)

//by using flag
//time complexity = O(n)
