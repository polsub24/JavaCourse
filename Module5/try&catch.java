public class Try {
	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		}
		catch (Exception obj) {
			System.out.println("arithmetic exception handled");
			System.out.println(obj);
		}
		System.out.println("rest of the code");
	}
}
