package ASSIGNMENT1.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

        List<String> arr2 = new ArrayList<>();
        arr2.add("arr2");
        arr2.add("arr2");

        List<String[]> list1 = new ArrayList<String[]>();
        String[] arr3 = { "1", "2", "3" };
        String[] arr4 = { "1", "2", "3" };
        list1.add(arr3);
        list1.add(arr4);

        for (String[] i : list1) {
            System.out.println(Arrays.toString(i));
        }

        String[] arr8 = { "a", "b", "c" };
        String[] arr9 = { "1", "2", "3", "4" };
        List<String[]> list = new ArrayList<String[]>();

        list.add(arr8);
        list.add(arr9);
        // printing list of String arrays in the ArrayList
        for (String[] strArr : list) {
            System.out.println(Arrays.toString(strArr));
        }
    }
}