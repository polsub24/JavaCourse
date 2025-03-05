abstract class Bike{
    Bike(){
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
    static void method1(){
        System.out.println("static method");
    }
}
class Honda extends Bike{
    Honda(){
        System.out.println("child class constructor");
    }
    void run(){
        System.out.println("running safely . .");
    }
}
public class Ex_abstract {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
        Bike.method1();
    }
}
