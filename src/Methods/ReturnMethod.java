package Methods;



public class ReturnMethod {
    static int power(int a,int b){
        int result=1;
        for (int i=1;i<b;i++){
            result *=i;

        }
        return result;

    }

    public static void main(String[] arg){
        int deger=power(5,6);
        System.out.println(deger);
        System.out.println();


    }


}
