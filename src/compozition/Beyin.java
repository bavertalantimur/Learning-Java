package compozition;

public class Beyin {
    private Akıl akıl1;
    private int foksiyon;
    Beyin(Akıl akıl1,int foksiyon){
        this.akıl1=akıl1;
        this.foksiyon=foksiyon;
    }

    public  Akıl getAkıl1(){
        return this.akıl1;
    }
    public Akıl getAkıl1(Akıl akıl1){
        return this.akıl1=akıl1;
    }

    public int getFoksiyon(){
        return this.foksiyon;
    }
    public int setFonksiyon(int function){
        return this.foksiyon=function;
    }


}
