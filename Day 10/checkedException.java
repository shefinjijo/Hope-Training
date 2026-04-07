import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkedException {
    public static void main(String[] args) {
        try{
        FileReader f=new FileReader("HOPE_6_1.txt");
            System.out.println(f);
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
}
