class Superclass1{
    void display(){
        System.out.println("Superclass");
    }
    void display(int a, int b){
        System.out.println(a+b);
    }
}
class Subclass_n extends Superclass1{
    void display(double a,double b){
        System.out.println(a+" "+b);
    }
}
public class Ex_overload {
    public static void main(String[] args) {
        Subclass_n obj = new Subclass_n();
        obj.display();
        obj.display(2,3);
        obj.display(2.5,4.5);
    }
}
