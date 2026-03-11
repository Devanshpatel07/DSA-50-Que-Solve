
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("myFile.txt");

            obj.write("File in java are good and good....");
            obj.close();
            System.out.println("Sucessfully written");
        }
        catch(IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
