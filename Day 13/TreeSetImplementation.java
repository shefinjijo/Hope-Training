import java.util.*;

public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>(); //sorted by default
        ts.add(10);
        ts.add(100);
        ts.add(1);
        ts.add(50);  
        ts.add(34);
        System.out.println(ts);
        System.out.println("First :" +ts.first());
        System.out.println("Last :" +ts.last());
    }
}