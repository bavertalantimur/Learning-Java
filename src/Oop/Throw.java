package Oop;

public class Throw {
    public static void main(String[] args) {
        int a=0;
        if(a==0){
            System.out.println("bölen 0 a eşit olamaz");
            throw new ArithmeticException("Hataa varr wrongg");
        }

        System.out.println("Kodun devamı");

    }
}
