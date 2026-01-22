import java.util.HashMap;
import java.util.Map;

public class MaxFreq{
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,1,4,4,6,4,4,4};
        Map<Integer , Integer> freq = new HashMap<>();
        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }else{
                freq.put(el , freq.get(el) +  1);
            }
        }
        System.out.println("frequency Map");
        System.out.println(freq.entrySet());
        // int maxFreq = 0 , ansKey = -1;
        // for(var e: freq.entrySet()){
        //     if(e.getValue() > maxFreq){
        //         maxFreq = e.getValue();
        //         ansKey = e.getKey();
        //     }
        // }
        int mxFreq = 0 , ansKey = -1;
        for(var  key: freq.keySet()){
            if(freq.get(key)> mxFreq){
                mxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.println(ansKey);
    }
}

//Time complexity = o(N)