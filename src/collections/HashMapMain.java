package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap b=new HashMap();
        b.put("Türkiye","Ankara");
        b.put("Fransa","Paris");
        b.put("İngiltere","Londra");
        b.put("Türkiye","Doha");


        System.out.println(b.get("Türkiye"));

        Set s=b.entrySet();
        Iterator i=s.iterator();

        while(i.hasNext()){
            Map.Entry item=(Map.Entry) i.next();
            System.out.println(item.getKey()+ "=>" + item.getValue());
        }
    }
}
