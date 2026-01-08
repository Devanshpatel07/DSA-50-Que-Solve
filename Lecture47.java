class Lecture47{
     static boolean  searchMatrix(int[][] a, int target){
        int n = a.length;
        int m = a[0].length;
        int st  = 0  , end = n*m-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            int midElt =  a[mid/m][mid%m]; // important
            if(midElt == target) return  true;

            if(target < midElt){
                end = mid -1;
            }else{
                st = mid +1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 6;

        System.out.println(searchMatrix(a, target));
    }
}

//t.c O(logn)