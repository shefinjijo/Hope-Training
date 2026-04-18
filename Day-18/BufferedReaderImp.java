import java.io.*;
public class BufferedReaderImp {
    public static void main(String[] args) {
        try {
            BufferedReader bfr=new BufferedReader(new FileReader("file.txt"));
            while(bfr.ready()){
                System.out.println(bfr.readLine());
            }
            bfr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
