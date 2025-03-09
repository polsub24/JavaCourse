interface In1{// nested inheritance
    void display1();
    interface In2{
        void display2();
    }
}
class Ch2 implements In1.In2{
    public void display1(){
        System.out.println("interface 1 implemented");
    }
    public void display2(){
        System.out.println("interface 2 implemented");
    }
    void display3(){
        System.out.println("child class method");
    }
}
public class Ex_Interface3 {
    public static void main(String[] args) {
        Ch2 obj = new Ch2();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
