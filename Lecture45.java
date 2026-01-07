public class Lecture45 {

    static boolean binarySearchRec(int[] a , int st , int end ,int target ){
        if(st > end){
            return false;
        }
        int mid = st + (end-st)/2;
        if(target == a[mid]){
            return true;
        }else if(target < a[mid]){
            return  binarySearchRec(a, st, mid-1, target);
        }else{
            return  binarySearchRec(a,  mid+1, end ,target);
        }
    }

    static boolean binarySearch(int[] a, int target) {
        int n = a.length;
        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (target == a[mid]) {
                return true;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int target = 0;
        while(target != 10){
            System.out.println(" " +binarySearchRec(a, 0, a.length-1, target));
            System.out.println(" "+ binarySearch(a, target));
            target++;
        }
}
}

//iterative O(1)
// recursion O(log n)