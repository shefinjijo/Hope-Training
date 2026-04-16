import java.io.*;
public class FileWriterIMplementation{
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("file.txt");
            writer.write("hello da");
            writer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}