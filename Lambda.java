interface Add{
    int addition(int a , int b);
}
public interface Lambda {
    public static void main(String[] args) {
        Add add = (a , b) -> a+b; // lambda expression add two number
        int result = add.addition(10, 20);
        System.out.println("Sum:" +result);

    }
}
