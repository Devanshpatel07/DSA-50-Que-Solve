import  java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File obj  = new File("myFile.txt");

        if(obj.delete()){
            System.out.println("the delete file is:" +obj.getName());
        }else{
            System.out.println("Falied to delete a file");
        }
    }
}
