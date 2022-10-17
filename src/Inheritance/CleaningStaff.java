package Inheritance;

public class CleaningStaff extends Officers{
    String gorev;

    public CleaningStaff(String nameSurname, String eposta, String phone, String gorev) {
        super(nameSurname, eposta, phone);
        this.gorev = gorev;
    }
}
