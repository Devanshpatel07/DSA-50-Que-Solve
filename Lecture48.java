public class Lecture48 {

    static boolean isDivisionPossible(int[] a , int m, int mxChocAtAllowed){
        int numOfStudents = 1;
        int choc = 0;

        for(int i=0 ; i < a.length ; i++){
            if(a[i]> mxChocAtAllowed) return false;
            if(choc + a[i] <= mxChocAtAllowed){
                choc += a[i];
            }else{
                numOfStudents++;
                choc = a[i];
            }
        }
        return true;
        // if(numOfStudents > m) return false;
        // return true;
    }

    static  int isDistrbutedChocolates(int[] a, int m){
        if(a.length <m ) return -1;
        int ans = 0 , st = 1 , end = (int)1e9;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(isDivisionPossible(a,m,mid)){
                ans = mid;
                end = mid -1;
            }else{
                st = mid+1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {5,3,1,4,2};
        int m = 3;
        System.out.println(isDistrbutedChocolates(a,m));
    }
}
