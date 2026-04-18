import java.io.*;
public class FileWriterImp {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hello,This is the Sample Text Writer"); 
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
