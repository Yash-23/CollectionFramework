import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args){

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Yash", 1));
        studentSet.add(new Student("Aniboi", 3));
        studentSet.add(new Student("Chirag", 2));
        studentSet.add(new Student("Lavesh", 2));

        System.out.println(studentSet);
//        Set<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(0);
//        set.add(50);
//        set.add(30);
//        set.add(90);
//        set.add(90);
//        set.add(20);
//        System.out.println(set);
//        set.remove(90);
//        System.out.println(set);
//        System.out.println(set.contains(30));
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
    }
}
