interface MyFunctionalInterface {
    void abstractFun(int x);
}

public class FunInterface {
    public static void main(String[] args) {
        MyFunctionalInterface fobj = (int x) -> System.out.println(2*x);
        fobj.abstractFun(5);
    }
}

