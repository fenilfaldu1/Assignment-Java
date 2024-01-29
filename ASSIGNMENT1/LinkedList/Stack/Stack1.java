package ASSIGNMENT1.LinkedList.Stack;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {

        Stack<Integer> tk = new Stack<>();
        boolean result = tk.empty();
        System.out.println("Is stack empty " + result);

        tk.push(12);
        tk.push(13);
        tk.push(14);
        tk.push(15);
        tk.push(16);
        System.out.println("Elements in stack " + tk);
        result = tk.empty();

        System.out.println("is the stack empty " + result);

        Stack<String> tk1 = new Stack<String>();
        tk1.push("hello1");
        tk1.push("hello2");
        tk1.push("hello3");
        tk1.push("hello4");

        System.out.println(tk1);

        String fr1 = tk1.peek();
        System.out.println(fr1);

        int loc = tk1.search("hello1");
        System.out.println("Location of hello1 is " + loc);

    }
}