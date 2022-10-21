package collections;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList  country=new ArrayList();
        country.add(5);
        country.add("Ankara");
        country.add("siirt");
        country.add("bolu");
        country.add("Ankara");
        country.add("Siverek");


        country.add(0,"İstanbul");
        country.add(2,"diyarbakır");

        country.remove(4);


        country.forEach(i-> System.out.println(i));

    }
}
