interface P{
    static final int i=5;
    void display();
    default void display1(){
        System.out.println("default method");
    }
    static void display2(){
        System.out.println("static method");
    }
}
class C implements P{
    public void display(){
        System.out.println("abstract method");
        System.out.println(i);
    }
}
public class Ex_interface1 {
    public static void main(String[] args){
        C obj = new C();
        obj.display();
        obj.display1();
        P.display2();
        System.out.println(P.i);
    }
}
