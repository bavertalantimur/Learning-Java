package Inheritance;

public class Assistant extends Academician {

    protected String yuksekLisans;


    public String getYuksekLisans() {
        return yuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        this.yuksekLisans = yuksekLisans;
    }

    Assistant(String nameSurname, String eposta, String phone, String department, String tasks, String lessonns, String yuksekLisans) {
        super(nameSurname, eposta, phone, department, tasks, lessonns);
        this.yuksekLisans=yuksekLisans;
    }
}
