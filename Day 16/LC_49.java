import java.util.*;

class LC_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> list=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            list.putIfAbsent(key,new ArrayList<>());
            list.get(key).add(str);
        }
        return new ArrayList<>(list.values());
    }
}