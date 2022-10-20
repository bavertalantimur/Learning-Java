package compozition;

public class Runner {
    public static void main(String[] args) {
        Computer casper=new Computer();

        Akıl a1=new Akıl(45);
        Beyin b1=new Beyin(a1,163);
        System.out.println(b1.getAkıl1().getSeviye());




    }
}
