import java.util.*;
public class LinkedListImplementation {
    public static void main(String[] args) {
        List<String> runningRace=new LinkedList<>(); 
        runningRace.add("A");
        runningRace.add("B");
        runningRace.add("C");
        runningRace.addFirst("Start Race");
        System.out.println(runningRace);
        runningRace.remove("B");
        System.out.println("B is disqualified");
        System.out.println(runningRace);
        runningRace.addLast("Race completed");
        System.out.println(runningRace);
    }
}
