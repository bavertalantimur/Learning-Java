package collections;

import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet tree=new TreeSet();
        tree.add(10);
        tree.add(1);
        tree.add(2);
        tree.add(6);
        // küçükten büyüğe doğrı sıralama yapar:
        tree.forEach(item-> System.out.println(item));


    }
}
