
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
public class FileReaderExample {

    public static void main(String[] args) {
        // try (FileReader fr = new FileReader("note.txt")) {
        //     int letters = fr.read();
        //     while (letters != -1) {
        //         System.out.println((char) letters);
        //         letters = fr.read();
        //     }
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }
        // try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //     // byte to char stream and then reading char stream
        //     System.out.println("You typed:" +br.readLine());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        //output
        OutputStream os = System.out;
        // os.write(😊);
        System.out.println();

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello world");
            osw.write(97);
            osw.write(19);
            osw.write('A');
            osw.write('\n');
            char[] arr = "hello world".toCharArray();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
