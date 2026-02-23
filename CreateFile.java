import java.io.File;
import java.io.FileWriter;

class CreateFile{
    public static void main(String[] args) throws Exception {
        File obj = new File("Greeting.txt");
        System.out.println("File created:");
        obj.createNewFile();
        System.out.println(obj.exists());
        FileWriter fw = new FileWriter(obj);
        fw.write("hii i am a coder ");
        fw.close();
        // FileReader fr = mew FileReader(file);
}
}