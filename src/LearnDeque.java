import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args){
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(10);
        arrayDeque.offerFirst(20);
        arrayDeque.offer(15);
        arrayDeque.offerLast(5);
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
    }
}
