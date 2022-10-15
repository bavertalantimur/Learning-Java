package Oop;

public class Employee {
    private String name;
    public double salary;
    private int workHours,hireYear;

    Employee(int hireYear,int workHours,double salary,String name){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        if(this.salary >=1000)
            return this.salary*0.03;
        return 0.0;
    }

    public double bonus(){
        int extraHours=workHours-40;
        return 30 * extraHours;
    }
    public  double increase(){
        int year=2022-this.hireYear;
        if(year <10){
            return salary * 0.5;
        }else  if (year >= 10 && year < 20){
            return salary * 0.1;
        }else {
            return salary * 0.15;
        }

    }


}
