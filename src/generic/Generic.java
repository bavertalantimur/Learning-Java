package generic;

import java.util.ArrayList;
import java.util.HashMap;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(5);
        //a.forEach(System.out::println);
        //a.forEach(i-> System.out.println(i));

        for (Integer obj:a){
            System.out.println(obj);
            System.out.println(obj.doubleValue());
        }
        System.out.println("-----");

        HashMap<Integer,String> c=new HashMap<>();

        c.put(1,"Ankara");
        c.put(6,"İstanbul");
        c.put(7,"Diyarbakır");
        for (Integer key:c.keySet()){
            System.out.println("Key"+key+"Value"+c.get(key));
        }

        for(String value:c.values()){
            System.out.println(value);
        }
        System.out.println("----");


        Test<Integer> i=new Test<>(15);
        System.out.println(i.getObj());

        Test<String> s=new Test<>("Kodlama vakti");
        System.out.println(s.getObj());

        System.out.println("-----");

        Test2<Integer,String>  test2=new Test2<>(10,"baver");
        test2.print();






    }
}
