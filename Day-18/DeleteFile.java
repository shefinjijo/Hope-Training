import java.io.*;
public class DeleteFile{
    public static void main(String[] args){
        File file = new File("file.txt");
        try{
            if(file.delete()){
                System.out.println("File is deleted");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}