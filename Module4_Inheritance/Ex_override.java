class Pr1{
    void display(){
        System.out.println("parent class");
    }
}
class chh1 extends Pr1{
    void display(){
        System.out.println("child class");
    }
}
public class Ex_override {
    public static void main(String[] args) {
        chh1 obj = new chh1();
        obj.display();
    }
}
