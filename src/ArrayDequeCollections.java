import java.util.*;

public class ArrayDequeCollections {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Amey");
        deque.add("Ramesh");
        deque.add("Suresh");
        deque.remove("Suresh");
//        System.out.println(deque.isEmpty());
//        System.out.println(deque.contains("Amey"));
//        deque.clear();
        for(String str : deque){
            System.out.println(str);
        }

    }
}
