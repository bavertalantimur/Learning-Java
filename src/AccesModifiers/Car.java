package AccesModifiers;

public class Car {
    private  int enginePower,model;
    public int speed;
    protected String color;
    Car(){
        this.model=2020;
        this.enginePower=3400;
        this.speed=120;
        this.color="red";
    }
    private void print(){
        System.out.println(this.model);
    }
    public void run(){
        print();
    }

}
