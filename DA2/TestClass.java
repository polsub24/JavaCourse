abstract class Device{
	public abstract void start();
}
class Phone extends Device{
	public void start(){
		System.out.println("Phone started");
	}
}
class Laptop extends Device{
	public void start(){
		System.out.println("Laptop started");
	}
}
public class TestClass {
	public static void main(String[] args){
		Device P = new Phone();
		Device L = new Laptop();
		P.start();
		L.start();
	}
}
