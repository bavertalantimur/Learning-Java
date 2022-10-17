package Inheritance;

public class Employee {
    String nameSurname,eposta;
    int phone;
    public static int numberLogin=0;
    public  static int login(){
        return ++Employee.numberLogin;
    }
}
