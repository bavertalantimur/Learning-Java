package Encapsulation;

public class Empolyee {
    private String name;
    private double salary;
    private String year;
    Empolyee(String name,double salary,String year){
        this.name=name;
        this.salary=salary;
        this.year=year;

    }
    Empolyee(){

    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public String getYear(){
        return this.year;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setYear(String year){
        this.year=year;
    }
    public static void getEmploye(Empolyee e1){
        System.out.println(e1.getName()+","+e1.getSalary()+","+e1.getYear());
    }

}
