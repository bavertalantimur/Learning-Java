package Oop;

public class Constructor {
    public int sayi1;
    public int sayi2;
    public String renk;
    Constructor(int s1,int s2 , String renk){
        this.sayi1=s1;
        this.sayi2=s2;
        this.renk=renk;
    }
    public int toplam(){
        return this.sayi1+this.sayi2;
    }

}
