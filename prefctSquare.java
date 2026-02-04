public class prefctSquare{
    public static boolean perfectCube(int n){
        int cube;
        for(int i=1;i<=n;i++){
            cube = i*i*i;

            if(cube == n)
                return true;
            else if(cube>n)
                return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 216;
        System.out.println(perfectCube(n)? "yes":"No");
    }
}
