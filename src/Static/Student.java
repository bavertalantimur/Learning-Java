package Static;

public class Student {
    public int x;
    public String name;
    public int id,point;
    private static int counter=0;
    Student(String name , int id,int point){
        this.name=name;
        this.id=id;
        Student.counter++;
        this.point=point;
        x++;
    }

    public void exit(){
        Student.counter--;
    }

    public static int howStudent(){
        return Student.counter;
    }

    public static double calcOverall(int [] arr){
        double overall=0;
        for (int i=0;i<arr.length;i++){
            overall +=arr[i];
        }
        return  overall / arr.length;
    }
    public int value(){
        return x;
    }
}
