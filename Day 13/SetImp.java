import java.util.*;
public class SetImp {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Integer a=1;
        set.add(a);
        set.toArray();
        System.out.println(set);
        set.add(2);
        System.out.println(set);
        System.out.println(a.hashCode());
        System.out.println(set.contains(1));
        
        set.size();
         
    }
}