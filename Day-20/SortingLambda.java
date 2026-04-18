import java.util.*;
public class SortingLambda {
    public static void main(String[] args) {
        List<String> words= new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("grape");
        words.add("orange");
        Collections.sort(words,(s1,s2)->s2.compareTo(s1));//reverser sorting
        words.sort(String::compareTo);//alphabetical sorting
        System.out.println(words);
    }
}
