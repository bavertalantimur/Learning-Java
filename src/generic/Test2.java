package generic;

public class  Test2<T,U> {
    T obj1;
    U obj2;
    Test2(T obj1,U obj2){
        this.obj1=obj1;
        this.obj2=obj2;

    }

    public void  print(){
        System.out.println("obj1 = "+obj1+" Obj 2 = "+obj2);
    }
}
