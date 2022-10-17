package Inheritance;

public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("baver","sdajbns@gmail.com","0554665");
        Academician a1=new Academician("bavertalantimur","gfkfdkk","1235","gjkfkjgfj","fklsgl","kjgkjd");


        System.out.println(Academician.login());


        Assistant ass1=new Assistant("sadad","dslkdsf","fklkfdsl","fdgfd","fdllşdf","fdfgfd","fdfdofdo");
        ass1.enterCourse();
        System.out.println(ass1.getNameSurname());
        Lecturer l1=new Lecturer("fdlşsldsl","ofpdopgfo","opfdo","kdlflkgd","gdfdofd","dfllfdldf","asistan");
        l1.enterCourse();
        System.out.println(emp1.giris());
        System.out.println(a1.giris());
        System.out.println(l1.giris());



    }
}
