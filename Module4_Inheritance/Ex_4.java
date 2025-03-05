class ClassA{
    void display(){
        System.out.println("ClassA");
    }
}
interface InterfaceB{
    void display1();
}
interface InterfaceC{
    void display2();
}
class ClassD extends ClassA implements InterfaceB, InterfaceC{
    public void display1(){
        System.out.println("ClassB");
    }
    public void display2(){
        System.out.println("ClassC");
    }
    void display3(){
        System.out.println("ClassD");
    }
}
public class Ex_4{
    public static void main(String[] args){
        ClassD obj = new ClassD();
        obj.display();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
