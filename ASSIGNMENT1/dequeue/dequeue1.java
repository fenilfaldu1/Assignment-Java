package ASSIGNMENT1.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue1 {
    public static void main(String[] args) {
        Deque<String> d1 = new ArrayDeque<>();
        d1.offer("arival");
        d1.offer("jai");
        d1.add("hello1");
        d1.offer("jai1");

        for (String s : d1) {
            System.out.println(s);
        }
        d1.pollLast();
        for (String s : d1) {
            System.out.println(s);
        }
    }
}
