package Stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class iterator {
    public static void main(String[] args) {
        Stack<String> tk1 = new Stack<String>();
        tk1.push("hello1");
        tk1.push("hello2");
        tk1.push("hello3");
        tk1.push("hello4");

        //ITERATOR OVER STACK FROM BOTTOM TO TOP
        System.out.println("BOTTOM TO TOP");
        Iterator itr=tk1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //ITERATOR OVER STACK FROM TOP TO BOTTOM
        System.out.println("TOP TO BOTTOM");
        ListIterator<String> it1= tk1.listIterator(tk1.size());
        while(it1.hasPrevious()){
            System.out.println(it1.previous());
        }
    }
}