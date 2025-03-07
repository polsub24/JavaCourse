class P1{
	P1(){
		System.out.println("parent class constructor");
	}
	int i =5;
	void display() {
		System.out.println("parent class");
	}
}
class C1 extends P1{
	C1(){
		System.out.println("child class constructor");
	}
	C1(int j){
		super();//means parent class is called not writing it still includes calling parent class constrcutor
		System.out.println(j);
	}
	int i =10;
	void display() {
		System.out.println("Child class");
	}
	void show() {
		display();//method overriding (child class method)
		super.display(); //parent class method
		System.out.println(i);
		System.out.println(super.i); //parent instance variable 
	}
}
public class Ex_Superkeyword {
	public static void main(String[] args) {
		 C1 obj = new C1();
		 obj.display();
		 obj.show();
		 C1 obj1 = new C1(20);
	}
}
		 obj.display();
		 obj.show();
	}
}
