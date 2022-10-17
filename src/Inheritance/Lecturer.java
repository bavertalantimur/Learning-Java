package Inheritance;

public class Lecturer extends Academician {
    String unvan;

    public Lecturer(String nameSurname, String eposta, String phone, String department, String tasks, String lessonns, String unvan) {
        super(nameSurname, eposta, phone, department, tasks, lessonns);
        this.unvan = unvan;
    }

    public String  giris(){
        return  this.unvan + " giris yapti ";
    }

}
