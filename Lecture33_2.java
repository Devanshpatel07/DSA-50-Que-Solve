
import java.util.ArrayList;

public class Lecture33_2 {
    static ArrayList<Integer> allIndex(int[] a , int n , int target , int idx){
//base case 
if(idx >= n){
    return new ArrayList<Integer>();
}

//self work

ArrayList<Integer> ans = new ArrayList<>();

if(a[idx] == target){
    ans.add(idx);
}
// recursion
ArrayList<Integer> smallAns = allIndex(a, n, target, idx+1);
ans.addAll(smallAns);
return ans;
    }
    public static void main(String[] args) {
        int a[] = {1,2,4,4,5,4};
        int target = 4;
        int n = a.length;
        ArrayList<Integer> ans =  allIndex(a, n, target, 0);
        for (Integer i : ans){
            System.out.println(i);
        }
}
}