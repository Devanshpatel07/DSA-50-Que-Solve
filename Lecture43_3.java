import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Lecture43_3 {

    static void bucketSort(float[] arr){
        // create bucket
        int n  =arr.length;
        // bucket
        ArrayList<Float>[] buckets = new ArrayList[n];
        //create empty buckets
        for(int i=0 ; i<n ;i++){
            buckets[i] = new ArrayList<Float>();
        }

        //add element in the bucket
        for(int i=0 ; i<n ; i++){
            int bucketindex = (int) arr[i] * n;
        buckets[bucketindex].add(arr[i]);
        }

        //sort each bucket
        for(int i=0 ; i<buckets.length ; i++){
            Collections.sort(buckets[i]);
        }

        //Merge all buckets
        int index= 0;
        for(int i=0 ; i<buckets.length ; i++){
        ArrayList<Float> currBucket = buckets[i];
        for(int j=0 ; j<currBucket.size() ; j++){
            arr[index++] = currBucket.get(j);
        }
        }

    }
    public static void main(String[] args) {
        float[] a = {0.5f,0.4f,0.3f,0.2f,0.1f};
        bucketSort(a);
        for (float val : a) {
            System.out.println(val + " ");
        }
    }
}

//Time Complexity = O(N+K)
//space complexity = O(N)
