package generic;

public class GenericMethod {
    public static  <E> void genericMethod(E[] arr){
        for(E item:arr){
            System.out.println(item);
        }
    }
}
