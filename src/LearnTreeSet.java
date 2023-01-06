import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args){
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(0);
        set.add(50);
        set.add(30);
        set.add(90);
        set.add(90);
        set.add(20);
        System.out.println(set);
        set.remove(90);
        System.out.println(set);
        System.out.println(set.contains(30));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
