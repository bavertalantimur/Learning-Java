package Methods;


import Arrays.Arrays;

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

        /*Arrays arr=new Arrays();
        arr.a=9;*/


    }


}
