interface I1{// multilevel or hierarhcial inheritance
    void display1();
}
interface I2 extends I1{
    void display2();
}
class Ch1 implements I2{
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
public class Ex_Interface2 {
    public static void main(String[] args) {
        Ch1 obj = new Ch1();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
