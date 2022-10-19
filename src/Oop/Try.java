package Oop;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        System.out.println("Program basladi");
        int a=0,b;
        int[] arr =new  int[3];
        Scanner scan=new Scanner(System.in);

        try {
            //a=2/1; //hata yakaladı ve try içerisindeki diğer şeyler okumaz
            //System.out.println(a);
            //arr[4]=10;
            System.out.print("bir sayi giriniz:");
            b= scan.nextInt();

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array boyut hatası");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("bir hata var");
            System.out.println(e.toString());
        }

        System.out.println("Program bitti");
    }
}
