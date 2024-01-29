package LinkedList;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("hello2");
        l1.add("hello34");
        System.out.println(l1);

        LinkedList<String> l2 = new LinkedList<>();
        l2.add("fenil");
        l2.addAll(l1);
        System.out.println(l2);

        LinkedList<String> l3 = new LinkedList<>();
        l3 = (LinkedList<String>) l2.clone();// this will clone the l2 to l3
        System.out.println("THIS IS L3" + l3);

        // this is with anonymous class
        Collections.sort(l3, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        // this is with lambda expression
        Collections.sort(l3, (o1, o2) -> (o1.length() > o2.length()) ? -1 : (o1.length() < o2.length()) ? 1 : 0);

        // Iterator i=l2.descendingIterator();//this will iterate loop from back
        // while(i.hasNext()){
        // System.out.println(i.next());
        // }
        System.out.println(l3);
    }
}
