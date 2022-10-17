package Inheritance;

public class SecurityOfficer extends Officers{
    String belge;

    public SecurityOfficer(String nameSurname, String eposta, String phone, String belge) {
        super(nameSurname, eposta, phone);
        this.belge = belge;
    }
}
