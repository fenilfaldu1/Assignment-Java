package Vector;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<String>(5);
        v1.add("tiger");
        v1.add("LION");
        v1.add("hello");
        v1.add("helllo2");
        v1.add("hello3");
        v1.add("hello4");
        System.out.println(v1);
        System.out.println("size" + v1.size());
        // Here if initial capacity is defined and elements are more than initial
        // capacity
        // then capacity will be 2x of the initial capacity
        System.out.println("Default capacity " + v1.capacity());

    }
}
