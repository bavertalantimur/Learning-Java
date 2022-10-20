package NestedClass;

public class Static {
    private int a=10;
    private static int b=12;
    public  static class StaticInner{
        int a=1;
        int b=7;
        public void run(){
            System.out.println("------");
            System.out.println(a);
            System.out.println(this.a);
            //System.out.println(Static.a);  a statik olmadığı için
            System.out.println(b);
            System.out.println(Static.b);

        }
    }
}
