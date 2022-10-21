package collections;

import java.util.*;

public class HashsetMain {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("12 str");
        h.add(12);
        // h.add(12);   aynı türden iki veri tutmaz
        h.add(12.0);
        h.add(true);
        h.add(null);

        h.remove("12 str");
        //h.clear();// tüm kümeyi siler h.clear();

        System.out.println(h.contains("12 str")); // false döndürür çünkü 12 str yi sildik
        System.out.println("------");
        System.out.println(h.contains(12));//  12 varsa true döndürür
        System.out.println("-----");
        System.out.println(h.size());
        System.out.println("------");

        Iterator itr=h.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        System.out.println("------");
        h.forEach(item-> System.out.println(item + ""));
    }
}
