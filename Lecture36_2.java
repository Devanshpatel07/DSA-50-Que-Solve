public class Lecture36_2 {
    static void printSSQ(String s , String currAns){
         //s = "abc" , currAns = ""
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1); // bc

        //cur char
        printSSQ(remString, currAns + curr); //bc , a

        printSSQ(remString, currAns); // bc , " "
    }
     public static void main(String[] args) {
         printSSQ("ABC", " ");
     }
}
