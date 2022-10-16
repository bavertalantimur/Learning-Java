package Oop;

public class Class {
    /*
    * instance oluşturmamızı sağlar
    * parantez içerisine değer girilerek objeye veri aktarımı sağlar
    * Polyphism Animal a=new Cat();
    *
    * */
    public static void main(String[] arg){
        HesapMakinesi makine1=new HesapMakinesi();

        System.out.println("makine1 " + makine1.sayi1);

        HesapMakinesi makine2=new HesapMakinesi();
        makine2.sayi1=10;
        System.out.println("makine2 " + makine2.sayi1);

        Constructor c1 =new Constructor(5,6,"siyah");

        c1.sayi1=10;
        System.out.println(c1.sayi1+"---"+c1.sayi2);
        System.out.println(c1.toplam());






    }


}
