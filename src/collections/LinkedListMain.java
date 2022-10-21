package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("Armut");
        list.add("Çilek");
        list.add("Kavun");

        Iterator iter=list.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }
}
