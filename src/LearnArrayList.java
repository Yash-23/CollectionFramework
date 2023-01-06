import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
//        ArrayList<String> firstName = new ArrayList<>();
//        firstName.add("Yash");
//        System.out.println(firstName);

        List<Integer> Num = new ArrayList<>();
        Num.add(10);
        Num.add(20);
        Num.add(30);
        Num.add(50);
        Num.add(80);

        System.out.println(Num);

        for (int i = 0; i < Num.size(); i++) {
            System.out.println("Element is " +Num.get(i));
        }
        for (Integer ele: Num) {
            System.out.println("ForEach Loop element is " + ele);
        }
        Iterator<Integer> it = Num.iterator();
        while (it.hasNext()){
            System.out.println("iterator is at"+ it.next());
        }
//        System.out.println(Num);
//        Num.remove(3);
//        System.out.println(Num);
//        Num.remove(Integer.valueOf(30));
//        System.out.println(Num);
//
//        Num.clear();
//        System.out.println(Num);
//        Num.set(2,100);
//        System.out.println(Num);
//        System.out.println(Num.contains(100));
    }
}
