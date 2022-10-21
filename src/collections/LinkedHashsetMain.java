package collections;

import java.util.LinkedHashSet;

public class LinkedHashsetMain {
    public static void main(String[] args) {
        LinkedHashSet gunler=new LinkedHashSet();
        gunler.add("pazartesi");
        gunler.add("salı");
        gunler.add("çarşamba");
        gunler.add("perşembe");
        gunler.add("cuma");

        gunler.remove("çarşamba");
        gunler.add("cumartesi");

        //ilk giren ilk çıkar mantığı var
        // hahsetlerden farklı olarak sıralı bir bçimde getiriyor;

        gunler.forEach(item-> System.out.println(item));




    }
}
