class Pr1{
    Pr1(){
        System.out.println("parent class constructor");
    }
    void display(){
        System.out.println("parent class");
    }
}
class chh1 extends Pr1{
    chh1(){
        System.out.println("child class constructor");
    }
    void display(){
        System.out.println("child class");
    }
    chh1(int i){
        System.out.println(i);
    }
}
public class Ex_override1 {
    public static void main(String[] args) {
        chh1 obj = new chh1(6);
        obj.display();
    }
}
