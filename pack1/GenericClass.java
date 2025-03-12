//is a class where we can create multiple objects which can handle different types of data
public class GenericClass <T1,T2>{//T1 and T2 are objects
	public void display(T1 var1, T2 var2) {
		System.out.println(var1 +" "+var2);
	}
	public static void main(String[] args) {
		GenericClass<String, Integer> obj1 = new GenericClass<String, Integer>();
		obj1.display("JAM", 100);
		GenericClass<String, String> obj2 = new GenericClass<String, String>();
		obj2.display("Hi","Hello");
	}
}
