import java.io.*;
public class BufferedWriterImp {
    public static void main(String[] args) {
        try {
            BufferedWriter bfw=new BufferedWriter(new FileWriter("file.txt"));
            bfw.write("Hello,World!!");
            bfw.newLine();
            bfw.write("Welcome to Java Programming");
            bfw.newLine();
            bfw.append("appendinggg!!");
            bfw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
}
}