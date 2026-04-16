import java.io.*;
public class BufferedReaderImp{
    public static void main(String[] args){
    try{
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
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