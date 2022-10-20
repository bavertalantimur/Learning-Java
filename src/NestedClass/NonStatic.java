package NestedClass;

public class NonStatic {
    // aynı sınıfta olduğu için bu değişkene ulaşabilirim private olması engel değil
    private int a=10;
    private int b=5;

    public class Inner{
        int a=1;
        public void run(){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(NonStatic.this.a); // nonstatic sınıfının değişkenine ulaşabildik
            System.out.println(b);  //b ınnerde yok ama java üst sınıfına bakar varsa hata vermez
            //System.out.println(this.b); hata verir çünkü this classa bakar ve clasta b değişkeni yok
        }
    }


    public void run(){
        System.out.println("---------");
        System.out.println(a);
        System.out.println(this.a);
        Inner i=new Inner();
        System.out.println(i.a);
    }
}
