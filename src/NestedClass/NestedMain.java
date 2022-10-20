package NestedClass;

public class NestedMain {
    public static void main(String[] args) {
        NonStatic n=new NonStatic();
        NonStatic.Inner inner=n.new Inner();
        inner.run();
        n.run();



        Static.StaticInner s=new Static.StaticInner();
        s.run();



        Local l1=new Local();
        System.out.println("----");
        l1.run();
        System.out.println("------");


        Anonim a=new Anonim() {
            public void run(){
                System.out.println("Anonim sınıfına ait method");
            }
            public void print(){
                System.out.println("print");
            }

        };

        a.run();
        // a.print(); çalışmaz çünkü methodu override ediyor anonim sınıfında print adında metod yok
    }
}
