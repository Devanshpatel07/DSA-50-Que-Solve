import java.io.File;

public class CretaeFile {
    public static void main(String[] args) {
        try {
            File obj = new File("myFile.tt");

            if(obj.createNewFile()){
                System.out.println("File is created:" + obj.getName());
            }else{
                System.out.println("File already exist");
            }
}
catch (Exception e) {
        System.out.println("An error has occured");
        e.printStackTrace();
        }
    }
}
