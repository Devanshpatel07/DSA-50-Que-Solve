public class Lecture45_2 {
    static  int firstOccurence(int[] a, int x){
        int n = a.length;
        int st =0 , end = n-1;
        int fo = -1;
        while(st <= end){
            int mid = st+ (st+end)/2;
            if(a[mid] == x){
                fo = mid;
                end = mid - 1;
            }else if(x < a[mid]){
                end = mid -1;
            }else{
                st = mid+1;
            }
        }
        return fo;

    }
 public static void main(String[] args) {
     int arr[] = {1,14, 13,5,5,6,2,4};
     int x  = 5;
     System.out.println(firstOccurence(arr, x));
 }
}
