public class Interning {
    public static void main(String[] args) {
        String s = "hello";
        // String x = "hello";
        // x = "mello";
        // System.out.println(x);
        // change second char
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}
