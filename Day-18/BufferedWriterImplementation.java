import java.io.*;
public class BufferedWriterImplementation{
    public static void main(String[] args){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("hope_batch_1.txt",true));
            writer.write("prasanna");
            writer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}