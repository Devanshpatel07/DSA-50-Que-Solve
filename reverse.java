public class reverse{
    public static void main(String[] args) {
        StringBuilder  sb = new StringBuilder("physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.delete(2, 4);
        System.out.println(sb);
    }
}