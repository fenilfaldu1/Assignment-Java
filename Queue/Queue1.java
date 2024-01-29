package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

class Queue2 implements Comparable<Queue2> {
int id;
String name,author;
int quantity;


    public Queue2(int id,String name,String author,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.quantity=quantity;
    }

    @Override
    public int compareTo(Queue2 o) {
        if(id>o.id){
            return 1;
        } else if (id>o.id) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "id " + id;
    }
}
public class Queue1 {
    public static void main(String[] args){
        Queue<Queue2> q1=new PriorityQueue<Queue2>();

        Queue2 b1=new Queue2(12,"hello2","hello1 and 1",1);
        Queue2 b2=new Queue2(13,"hello3","hello1 and 2",2);
        Queue2 b3=new Queue2(14,"hello4","hello3 and 3",3);

        q1.add(b1);
        q1.add(b2);
        q1.add(b3);

        System.out.println(q1.toString());
        System.out.println("Traversing the queue");
        for(Queue2 i:q1){
            System.out.println(i);
        }
        q1.remove();
        System.out.println("After removing the one element");
        for(Queue2 k:q1){
            System.out.println(k);
        }

    }
}
