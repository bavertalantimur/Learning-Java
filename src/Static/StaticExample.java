package Static;

public class StaticExample {
    public static class Test{
        int a=0;
        static int b=0;
        Test(){
            a++;
            b++;
            System.out.println("a:"+a+"-b:"+b);
        }
    }

    public static class  Car{
        String model;
        double power;
        String year;

    }


    public static void main(String[] args) {
        System.out.println(StaticExample.a);
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();


        //final
        /*final int a=5;
        a=6;*/
        final Car c=new Car();
        c.model="sadads";
        //c=null;

    }
    public static int a=6;
}
