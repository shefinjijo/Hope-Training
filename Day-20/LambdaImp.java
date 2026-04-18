import java.util.*;
public class LambdaImp {
    public static void main(String[] args) {
       List<Integer> list=Arrays.asList(10,20,30,40,50);
         list.forEach((n)->System.out.println(n));
    }
}
