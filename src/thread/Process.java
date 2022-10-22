package thread;

public class Process implements Runnable {

    String name;
    Process(String name){
        this.name=name;
    }
    public void run() {
        try {
            for (int i=5;i>0;i--){

                System.out.println(this.name+":"+i);
                Thread.sleep(1000);
            }


        } catch (Exception e) {
            System.out.println(this.name+"hata ile karşılaşıldı");
        }
        System.out.println(name+" İslem bitti");
    }


}
