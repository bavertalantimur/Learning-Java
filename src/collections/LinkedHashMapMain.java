package collections;

import java.util.*;

public class LinkedHashMapMain {
    public static void main(String[] args) {
        LinkedHashMap ogr=new LinkedHashMap(); //TreeMap yaparsak notlar küçükten büyüğe sıralnır
        ogr.put("Ali",90);
        ogr.put("Veli",100);
        ogr.put("Ahmet",75);

        Set set =ogr.entrySet();
        Iterator i=set.iterator();
        while (i.hasNext()){
            Map.Entry item=(Map.Entry) i.next();
            System.out.println(item.getKey() + "=>"+ item.getValue());
        }

        System.out.println("----Tree Map-----");


        TreeMap student=new TreeMap();
        student.put(10,"Ayse");
        student.put(5,"Fatma");
        student.put(6,"leyla");



        Set set2 =student.entrySet();
        Iterator j=set2.iterator();
        while (j.hasNext()){
            Map.Entry item=(Map.Entry) j.next();
            System.out.println(item.getKey() + "=>"+ item.getValue());
        }
    }
}
