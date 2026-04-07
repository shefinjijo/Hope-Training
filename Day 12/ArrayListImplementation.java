import java.util.*;

public class ArrayListImplementation{
    public static void main(String[] args) {
        ArrayList<Integer> arrList=new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        System.out.println(arrList);
        System.out.println(arrList.contains(10));
        System.out.println(arrList.size());
        arrList.add(0);
        System.out.println(arrList.lastIndexOf(0));
        System.out.println(arrList.isEmpty());
        arrList.clear();
        System.out.println(arrList);
        

    }
}