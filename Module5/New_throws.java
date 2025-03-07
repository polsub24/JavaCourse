public class New_throws {
	static int div(int a, int b) throws ArithmeticException{
		int r = a/b;
		return r;
	}
	public static void main(String[] args) {
		try {
			System.out.println(div(15,0));
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
