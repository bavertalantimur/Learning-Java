package Inheritance;

public class Employee {
    protected String nameSurname,eposta,phone;

    public static int numberLogin=0;
    public  static int login(){
        return ++Employee.numberLogin;
    }

    public Employee(String nameSurname,String eposta,String phone){
        this.nameSurname=nameSurname;
        this.eposta=eposta;
        this.phone=phone;
    }

    public String getNameSurname(){
        return this.nameSurname;
    }
    public void setNameSurname(String nameSurname){
        this.nameSurname=nameSurname;
    }

    public String getEposta(){
        return this.eposta;
    }
    public void setEposta(String eposta){
        this.eposta=eposta;
    }

    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }


}
