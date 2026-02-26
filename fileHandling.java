import java.io.InputStreamReader;
import java.io.IOException;
public class fileHandling {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("enter some letters:");
            int letters = isr.read();
            while(isr.ready()){
                System.out.println((char) letters);
                letters = isr.read();
            }
            isr.close();
            System.out.print("enter some letters:");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
