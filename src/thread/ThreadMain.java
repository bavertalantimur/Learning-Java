package thread;

public class ThreadMain {
    public static void main(String[] args) {


        Process p1=new Process("ilk ");
        p1.run();
        System.out.println("---------");


        MultiThread multi1=new MultiThread("Birinci");
        Thread t1=new Thread(multi1);

        MultiThread multi2=new MultiThread("ikinci");
        Thread t2=new Thread(multi2);

        t1.start();
        t2.start();




    }
}
