package Encapsulation;

public class Execute {
    public static void main(String[] args) {
        Empolyee emp1=new Empolyee();
        emp1.setName("ali");
        emp1.setSalary(1250);
        emp1.setYear("2015");

        System.out.println(emp1.getName());

        Empolyee.getEmploye(emp1);
    }
}
