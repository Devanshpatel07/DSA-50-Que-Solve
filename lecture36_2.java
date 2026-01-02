public class lecture36_2 {
    static void combination(String dig ,String[] kp , String res){
        if(dig.length() == 0){
            System.out.println(res + "");
            return;
        }
        int currNum = dig.charAt(0); //2
        String currChoices = kp[currNum]; //"abc"


        for(int i=0;i<currChoices.length(); i++){
            combination(dig.substring(1) , kp , res+currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig = "23";
        String[] kp = {" " , " ", "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
        //              0    1      2      3 ......................... .............................
    combination(dig, kp, "");
    }
}

//time complxity = O(n*4**n)
