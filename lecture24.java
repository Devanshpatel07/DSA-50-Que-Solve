import java.util.ArrayList;
import java.util.Collections;

public class lecture24{
    static void reverseList(ArrayList<Integer> list){
int i=0, j= list.size()-1;
while(i<j){
Integer temp = Integer.valueOf(list.get(i));
list.set(i, list.get(j));
list.set(j , temp);

    i++;
    j--;
}

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List " +list);
        Collections.reverse(list);

        reverseList(list);
        System.out.println("Reversed List " +list);

        Collections.sort(list);
        System.out.println("Sort List " +list);

        Collections.sort(list , Collections.reverseOrder());
        System.out.println("Reverse order sort: " +list);


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("welcome");
        l1.add("to");
        l1.add("My Home");
        System.out.println("Orig.. List " +l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Sort... List " +l1);
}
}