import java.util.*;

public class FrequencyImplementation {
    public static void main(String[] args){
        Map<Character,Integer> map=new HashMap<>();
        String s="aaAAAAbbccdd";
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}