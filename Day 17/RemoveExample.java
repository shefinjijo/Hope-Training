import java.util.*;

public class RemoveExample{
     public static void main(String[] args) {
        List<Integer> lst= new ArrayList<>();
        lst.add(15);
        lst.add(20);
        lst.add(26);
        lst.add(30);
        System.out.println(lst);
        for(Integer i:lst){
            lst.remove(i);
        }
        System.out.println(lst);
    }
}