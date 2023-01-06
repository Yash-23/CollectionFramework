import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
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
