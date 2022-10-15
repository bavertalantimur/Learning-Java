package Oop;

public class EmployeeMain {
    public static void main(String[] arg){
        Employee emp1=new Employee(1985,45,2000,"kemal");
        System.out.println("tax=" + emp1.tax());
        System.out.println("bonus="+emp1.bonus());
        System.out.println("increase="+emp1.increase());
        double totalSalary= emp1.salary- emp1.tax()+ emp1.bonus();
        System.out.println("total salary="+totalSalary);


    }
}
