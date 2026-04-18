class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String result = "1"; //
        for(int i=2 ; i<=n ; i++){
            StringBuilder temp = new StringBuilder();
            int count =1;
        
        for(int j=0 ; j<result.length() ; j++){
            if(j < result.length()-1 && result.charAt(j) == result.charAt(j+1)){
                count++;
            }else{
                temp.append(count).append(result.charAt(j));
                count = 1;
            }
        }
        result = temp.toString();
    }
    return result;
    }
}