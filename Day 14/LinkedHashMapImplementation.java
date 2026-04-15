import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImplementation {
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        System.out.println(map);
        System.out.println(map.get("S"));
        System.out.println(map.get("Two"));
        System.out.println(map.getOrDefault("KSP", 0));
    }
}
