package hashset;

import java.util.*;

class student implements Comparable {
    int id;
    String name;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        student s = (student) obj;
        return Objects.equals(s, obj);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "id " + id + " name " + name;
    }
}

public class hashset1 {
    public static void main(String[] args) {

        HashSet<student> set = new HashSet<student>();
        student obj1 = new student(12, "fenil");
        student obj2 = new student(12, "fenil");

        set.add(obj1);
        set.add(obj2);

        System.out.println(set);

        for (student i : set) {
            System.out.println(i);
        }

    }
}
