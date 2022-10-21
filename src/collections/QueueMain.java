package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue q=new LinkedList(); // queu dan bır sınıf yok
        q.add("deniz");
        q.add("mehmet");
        q.add(5);
        q.offer("Damla");
        System.out.println("remove:"+ q.remove());
        System.out.println("------------");
        System.out.println(q.element());
        System.out.println("--------");
        q.forEach(i-> System.out.println(i));


    }
}
