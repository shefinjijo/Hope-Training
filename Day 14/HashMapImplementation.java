import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
    public static void main(String[] args) {
         Map<String,Integer> map=new HashMap<>();
        map.put("Hello",1);
        map.put("KSP",2);
        map.put("Java",3);
        System.out.println(map);
        System.out.println(map.get("Hello"));
        System.out.println(map.getOrDefault("KSP", 0));
    }
}
