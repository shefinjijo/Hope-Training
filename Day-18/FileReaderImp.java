import java.io.*;
public class FileReaderImp{
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("file.txt");
            String line;
            while((line = reader.readLine()) != null){
                System.out.print(line);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}